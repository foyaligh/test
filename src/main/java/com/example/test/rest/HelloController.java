package com.example.test.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/hello")
public class HelloController {
    public String sayHello() {
        return "Hello";
    }
}
