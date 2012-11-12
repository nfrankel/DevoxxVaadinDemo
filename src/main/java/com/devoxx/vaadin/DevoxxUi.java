package com.devoxx.vaadin;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;


public class DevoxxUi extends UI {

	@Override
	protected void init(VaadinRequest request) {

		HorizontalLayout layout = new HorizontalLayout();

		Label label = new Label("Hello Devoxx!");

		layout.addComponent(label);

		setContent(layout);
	}
}
