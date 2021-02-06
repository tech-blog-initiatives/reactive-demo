package org.tech.blog.reactivedemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Ready {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, world"
    }
}