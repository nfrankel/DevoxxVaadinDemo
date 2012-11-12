package com.devoxx.vaadin.behavior;

import static com.vaadin.ui.Notification.Type.ERROR_MESSAGE;

import com.devoxx.vaadin.view.MainView;
import com.vaadin.server.VaadinServiceSession;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Notification;
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

		String login = loginField.getValue();

		if (!"".equals(login)) {

			VaadinServiceSession.getCurrent().setAttribute(String.class, login);

			UI.getCurrent().setContent(new MainView());

		} else {

			Notification.show("Authentication failed", ERROR_MESSAGE);
		}
	}
}
