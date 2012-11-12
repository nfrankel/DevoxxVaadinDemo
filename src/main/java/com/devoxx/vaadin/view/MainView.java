package com.devoxx.vaadin.view;

import com.devoxx.vaadin.behavior.SayHelloBehavior;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class MainView extends CustomComponent {

	public MainView() {

		VerticalLayout layout = new VerticalLayout();

		layout.setSpacing(true);
		layout.setMargin(true);

		final TextField field = new TextField();

		layout.addComponent(field);

		Button button = new Button("Say hello");

		layout.addComponent(button);

		final Label label = new Label("Hello Devoxx!");

		layout.addComponent(label);

		button.addClickListener(new SayHelloBehavior(label, field));

		setCompositionRoot(layout);
	}
}
