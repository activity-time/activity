package ru.activity;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import ru.activity.rest.ActionServiceImpl;

import javax.ws.rs.ApplicationPath;

@Configuration
//@ApplicationPath("/api/v0.1")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        packages("ru.activity.model");
        register(ActionServiceImpl.class);
        register(JacksonFeature.class);
    }
}
