package ru.activity;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import ru.activity.rest.ActionServiceImpl;
import ru.activity.rest.StreamServiceImpl;

@Configuration
//@ApplicationPath("/api/v0.1")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        // register packages with POJOs to use for json serialization/deserialization
        packages("ru.activity.model");
        // register rest service (so jersey could invoke it)
        register(ActionServiceImpl.class);
        register(StreamServiceImpl.class);
    }
}
