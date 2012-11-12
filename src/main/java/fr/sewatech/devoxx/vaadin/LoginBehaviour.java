package fr.sewatech.devoxx.vaadin;

import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;

public class LoginBehaviour implements Button.ClickListener {

    private TextField loginField;
    private PasswordField passwordField;

    public LoginBehaviour(TextField loginField, PasswordField passwordField) {
        this.loginField = loginField;
        this.passwordField = passwordField;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        UI.getCurrent().setContent(new MainView());
    }
}
