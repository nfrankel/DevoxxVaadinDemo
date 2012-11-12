package fr.sewatech.devoxx.vaadin;

import com.vaadin.server.Page;
import com.vaadin.server.VaadinService;
import com.vaadin.server.VaadinServiceSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

public class LogoutBehaviour implements Button.ClickListener {
    @Override
    public void buttonClick(Button.ClickEvent clickEvent) {
        String contextPath = VaadinService.getCurrentRequest().getContextPath();
        //VaadinServiceSession.getCurrent().setAttribute(String.class, null);
        VaadinService.getCurrent().fireSessionDestroy(VaadinServiceSession.getCurrent());
        Page.getCurrent().setLocation(contextPath);
        //UI.getCurrent().setContent(new LoginView());
    }
}
