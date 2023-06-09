package com.Spring.hellomessaging.hellomessaging.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/hello/param/{name}")
    public String sayHello1(@PathVariable("name") String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/hello/post")
    public String sayHello(@RequestBody UserController user) {
        return "Hello " + user.getfName() + " " + user.getlName() + " from BridgeLabz";
    }
}
