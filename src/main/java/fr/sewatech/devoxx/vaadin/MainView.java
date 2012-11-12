package fr.sewatech.devoxx.vaadin;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServiceSession;
import com.vaadin.ui.*;

import java.io.Serializable;

public class MainView extends CustomComponent {

    public MainView() {
        Layout layout = new VerticalLayout();

        HorizontalLayout bar = new HorizontalLayout();
        bar.setWidth("100%");
        Label label = new Label();
        label.setValue(VaadinServiceSession.getCurrent().getAttribute(String.class));
        bar.addComponent(label);
        Button logoutButton = new Button("logout");
        bar.addComponent(logoutButton);
        bar.setComponentAlignment(logoutButton, Alignment.TOP_RIGHT);
        logoutButton.addClickListener(new LogoutBehaviour());
        layout.addComponent(bar);

        final Label hello = new Label("Hello");
        layout.addComponent(hello);

        final TextField textField = new TextField();
        layout.addComponent(textField);

        Button button = new Button("Click");
        button.addClickListener(new SayHelloClickListener(hello, textField));
        layout.addComponent(button);

        setCompositionRoot(layout);
    }
}