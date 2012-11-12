package com.devoxx.vaadin.view;

import com.devoxx.vaadin.behavior.LoginBehavior;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class LoginView extends CustomComponent {

	public LoginView() {

		FormLayout layout = new FormLayout();

		layout.setMargin(true);

		TextField loginField = new TextField("Login");

		layout.addComponent(loginField);

		PasswordField passwordField = new PasswordField("Password");

		layout.addComponent(passwordField);

		Button button = new Button("Login");

		layout.addComponent(button);

		button.addClickListener(new LoginBehavior(loginField, passwordField));
		
		setCompositionRoot(layout);
	}
}
