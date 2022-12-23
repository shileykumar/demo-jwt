package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class WelcomeController {


    @GetMapping("/get")
    public String welcome() {
        return "Welcome to home !!";
    }


}
