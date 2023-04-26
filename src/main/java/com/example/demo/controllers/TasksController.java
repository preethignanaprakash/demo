package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1>Hello</h1><h2> World</h2>";
    }
}
