package com.Spring.hellomessaging.hellomessaging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping
    public String greetHello(){
        return "Hello from BridgeLabz";
    }
    @GetMapping("/hello/query")
    public String sayHello(@RequestParam("name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
