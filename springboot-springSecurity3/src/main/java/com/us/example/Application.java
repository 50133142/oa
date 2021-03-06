package com.us.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.boot.SpringApplication.run;

/**
 * Created by yangyibo on 17/1/17.
 */

@ComponentScan(basePackages ="com.us.example")
@SpringBootApplication
public class Application {
    //start system entity
    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(Application.class, args);
    }

}
