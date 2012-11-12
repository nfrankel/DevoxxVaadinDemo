package fr.sewatech.devoxx.vaadin;

import com.vaadin.annotations.PreserveOnRefresh;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

@PreserveOnRefresh
public class DevoxxUI extends UI {
    private final MainView mainView = new MainView();

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        setContent(new LoginView());
    }
}
