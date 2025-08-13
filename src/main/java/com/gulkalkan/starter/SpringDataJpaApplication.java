package com.gulkalkan.starter;

import com.gulkalkan.Configuration.GlobalProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = "com.gulkalkan")
@ComponentScan(basePackages = "com.gulkalkan")
@EnableJpaRepositories("com.gulkalkan")
@EnableConfigurationProperties(value = GlobalProperty.class)

public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

}
