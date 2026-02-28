package com.pixelacademy.springdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello, world from Spring Boot";
    }
    @GetMapping("/ro")
    public String sayHelloRo() {
        return "Salut";
    }
    @GetMapping("/fr")
    public String sayHelloFr() {
        return "Bonjour";
    }
}
