package com.martsbradley.kpack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
}
