package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
public class MySpringBootApp {

    private final ApplicationPropertyConfig config;

    @Autowired
    public MySpringBootApp(ApplicationPropertyConfig config) {
        this.config = config;
    }

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApp.class, args);
    }

    @RestController
    public class HelloWorldController {
        @GetMapping("/hello")
        public Map<String, String> hello() {
            return config.getMyMap();
        }
    }
}