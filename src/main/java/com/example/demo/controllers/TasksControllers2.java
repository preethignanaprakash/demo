package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksControllers2 {

    @RequestMapping("/hello1 ")
    public String hello() {
        return "<h1>Hello</h1><h2> World from another file</h2>";
    }
}
