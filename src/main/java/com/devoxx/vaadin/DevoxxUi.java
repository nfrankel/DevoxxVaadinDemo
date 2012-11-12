package com.devoxx.vaadin;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;


public class DevoxxUi extends UI {

	@Override
	protected void init(VaadinRequest request) {

		HorizontalLayout layout = new HorizontalLayout();

		final TextField field = new TextField();

		layout.addComponent(field);

		Button button = new Button("Say hello");

		layout.addComponent(button);

		final Label label = new Label("Hello Devoxx!");

		layout.addComponent(label);

		button.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {

				label.setValue("Hello " + field.getValue() + "!");
			}
		});

		setContent(layout);
	}
}
