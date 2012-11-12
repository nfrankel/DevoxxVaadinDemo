package com.devoxx.vaadin.behavior;

import com.vaadin.server.Page;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServiceSession;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class LogoutBehavior implements ClickListener {

	@Override
	public void buttonClick(ClickEvent event) {

		String ctx = VaadinService.getCurrentRequest().getContextPath();

		VaadinService.getCurrent().fireSessionDestroy(
				VaadinServiceSession.getCurrent());

		Page.getCurrent().setLocation(ctx);
	}
}
