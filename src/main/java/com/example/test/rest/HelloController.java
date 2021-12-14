package com.example.test.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/hello")
public class HelloController {

    @RequestMapping(value = "$name", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello(@PathVariable String name) {
        return "Hello: " + name;
    }
}
