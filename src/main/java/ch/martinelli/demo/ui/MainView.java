package ch.martinelli.demo.ui;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    public MainView() {
        H1 h2 = new H1("Hello Vaadin WAR!");
        add(h2);
    }
}
