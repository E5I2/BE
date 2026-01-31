package com.example.e5i2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Hello", description = "Hello API")
@RestController
public class HelloController {

    @Operation(summary = "Say Hello", description = "Returns a hello message.")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
