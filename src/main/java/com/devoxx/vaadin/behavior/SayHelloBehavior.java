package com.devoxx.vaadin.behavior;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

public class SayHelloBehavior implements ClickListener {

	private final Label label;
	private final TextField field;

	public SayHelloBehavior(Label label, TextField field) {
		this.label = label;
		this.field = field;
	}

	@Override
	public void buttonClick(ClickEvent event) {

		label.setValue("Hello " + field.getValue() + "!");
	}
}
