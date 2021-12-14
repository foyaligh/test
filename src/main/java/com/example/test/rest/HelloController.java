package com.example.test.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/hello")
public class HelloController {

    @RequestMapping("$name")
    public String sayHello(@PathVariable String name) {
        return "Hello: " + name;
    }
}
