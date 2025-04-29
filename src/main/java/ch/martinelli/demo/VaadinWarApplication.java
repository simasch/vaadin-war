package ch.martinelli.demo;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Theme(value = "war")
@SpringBootApplication
public class VaadinWarApplication extends SpringBootServletInitializer implements AppShellConfigurator {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VaadinWarApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(VaadinWarApplication.class, args);
    }

}
