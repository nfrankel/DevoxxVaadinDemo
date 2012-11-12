package fr.sewatech.devoxx.vaadin;

import com.vaadin.ui.*;

public class LoginView extends CustomComponent {
    public LoginView() {
        FormLayout layout = new FormLayout();
        layout.setMargin(true);
        TextField loginField = new TextField("login");
        layout.addComponent(loginField);
        PasswordField passwordField = new PasswordField("password");
        layout.addComponent(passwordField);
        Button button = new Button("login");
        layout.addComponent(button);

        button.addClickListener(new LoginBehaviour(loginField, passwordField));
        setCompositionRoot(layout);
    }
}
