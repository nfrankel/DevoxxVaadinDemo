package fr.sewatech.devoxx.vaadin;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;

import java.io.Serializable;

public class SayHelloClickListener implements Button.ClickListener {
    private Label hello;
    private TextField textField;

    public SayHelloClickListener(Label hello, TextField textField) {
        this.hello = hello;
        this.textField = textField;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        hello.setValue(textField.getValue());
    }
}