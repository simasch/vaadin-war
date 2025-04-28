package ch.martinelli.demo.ui;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        H2 h2 = new H2("Hello Vaadin WAR!");
        add(h2);
    }
}
