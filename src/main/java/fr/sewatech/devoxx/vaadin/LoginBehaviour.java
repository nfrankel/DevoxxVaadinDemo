package fr.sewatech.devoxx.vaadin;

import com.vaadin.server.VaadinServiceSession;
import com.vaadin.ui.*;

public class LoginBehaviour implements Button.ClickListener {

    private TextField loginField;
    private PasswordField passwordField;

    public LoginBehaviour(TextField loginField, PasswordField passwordField) {
        this.loginField = loginField;
        this.passwordField = passwordField;
    }

    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        String login = loginField.getValue();
        if (login.isEmpty()) {
            Notification.show("Failed", Notification.Type.ERROR_MESSAGE);
        }  else {
            VaadinServiceSession.getCurrent().setAttribute(String.class, login);
            UI.getCurrent().setContent(new MainView());
        }
    }
}
