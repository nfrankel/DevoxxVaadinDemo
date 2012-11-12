package com.devoxx.vaadin;

import com.devoxx.vaadin.view.MainView;
import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;

@PreserveOnRefresh
public class DevoxxUi extends UI {

	@Override
	protected void init(VaadinRequest request) {

		setContent(new MainView());
	}
}
