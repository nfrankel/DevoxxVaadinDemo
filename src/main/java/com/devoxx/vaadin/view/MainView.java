package com.devoxx.vaadin.view;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.query.QueryDelegate;
import com.vaadin.data.util.sqlcontainer.query.TableQuery;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.Resource;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Table;
import com.vaadin.ui.Table.ColumnGenerator;
import com.vaadin.ui.VerticalLayout;

public class MainView extends CustomComponent {

	private static final DateFormat DF = new SimpleDateFormat("dd MMM yy");

	public MainView() {

		VerticalLayout layout = new VerticalLayout();

		layout.setSpacing(true);
		layout.setMargin(true);

		Table table = new Table();

		table.setWidth("100%");

		layout.addComponent(table);

		try {

			JDBCConnectionPool connectionPool = new SimpleJDBCConnectionPool(
					"org.h2.Driver", "jdbc:h2:~/test", "sa", "");

			QueryDelegate delegate = new TableQuery("PERSON", connectionPool);

			Container container = new SQLContainer(delegate);

			table.setContainerDataSource(container);

			table.setVisibleColumns(new String[] { "LAST_NAME", "FIRST_NAME",
					"BIRTHDATE", "MAIL" });

			table.setColumnHeader("LAST_NAME", "Family name");

			table.addGeneratedColumn("BIRTHDATE", new ColumnGenerator() {

				@Override
				public Object generateCell(Table source, Object itemId,
						Object columnId) {

					Item item = source.getItem(itemId);

					Property<Date> prop = item.getItemProperty(columnId);

					Date date = (Date) prop.getValue();

					return new Label(DF.format(date));
				}
			});

			table.addGeneratedColumn("MAIL", new ColumnGenerator() {

				@Override
				public Object generateCell(Table source, Object itemId,
						Object columnId) {

					Item item = source.getItem(itemId);

					Property<String> prop = item.getItemProperty(columnId);

					String mail = (String) prop.getValue();

					Resource res = new ExternalResource("mailto:" + mail);

					Link link = new Link(mail, res);

					return link;
				}
			});

		} catch (SQLException e) {

			throw new RuntimeException(e);
		}

		setCompositionRoot(layout);
	}
}
