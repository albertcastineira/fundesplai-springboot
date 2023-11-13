package com.exercises.annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/api/hello")
    public String sayHelloWorld() {
        return "Hello, World!";
    }
}
