package ru.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ActivityApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivityApiApplication.class, args);
    }

}
