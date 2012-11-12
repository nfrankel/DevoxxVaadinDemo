package com.devoxx.vaadin.behavior;

import com.devoxx.vaadin.view.LoginView;
import com.vaadin.server.VaadinServiceSession;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;

public class LogoutBehavior implements ClickListener {

	@Override
	public void buttonClick(ClickEvent event) {

		VaadinServiceSession.getCurrent().setAttribute(String.class, null);

		UI.getCurrent().setContent(new LoginView());
	}
}
