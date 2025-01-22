package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MySpringBootApp {

    private final String myVariable;
    private final String testVariable1;
    private final String testVariable2;

    public MySpringBootApp(
        @Value("${my.variable}") String myVariable,
        @Value("${my.testVariable1}") String testVariable1,
        @Value("${my.testVariable2}") String testVariable2) {
        this.myVariable = myVariable;
        this.testVariable1 = testVariable1;
        this.testVariable2 = testVariable2;
    }

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootApp.class, args);
    }

    @RestController
    public class HelloWorldController {
        @GetMapping("/hello")
        public String hello() {
            return String.format("my.variable: %s, my.testVariable1: %s, my.testVariable2: %s", myVariable, testVariable1, testVariable2);
        }
    }
}