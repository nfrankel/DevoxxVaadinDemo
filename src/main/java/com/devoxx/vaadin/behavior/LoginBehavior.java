package com.devoxx.vaadin.behavior;

import com.devoxx.vaadin.view.MainView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

public class LoginBehavior implements ClickListener {

	private final TextField loginField;
	private final PasswordField passwordField;

	public LoginBehavior(TextField loginField, PasswordField passwordField) {
		this.loginField = loginField;
		this.passwordField = passwordField;
	}

	@Override
	public void buttonClick(ClickEvent event) {

		if (!"".equals(loginField.getValue())) {

			UI.getCurrent().setContent(new MainView());
		}
	}
}
