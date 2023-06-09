package com.Spring.hellomessaging.hellomessaging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping
    public String greetHello(){
        return "Hello. Welcome to Spring Boot";
    }
}
