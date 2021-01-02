package org.tech.blog.reactivedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ready {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, world";
    }
}
