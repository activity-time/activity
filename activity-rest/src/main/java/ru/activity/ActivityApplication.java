package ru.activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@SpringBootApplication
public class ActivityApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivityApplication.class, args);
    }

    /**
     * json-data populator
     * set property 'ru.activity.db.populate' to true for data population
     */
    @ConditionalOnProperty(name = "ru.activity.db.populate")
    @Bean
    public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {
        Resource[] resources = { new ClassPathResource("data.json") };

        Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
        factory.setResources(resources);
        return factory;
    }
}
