package com.SpringFramework.API.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloConroller {

    @GetMapping("/hello")
    public String getGreeting() {
        return "Hello Spring World!";
    }
}
    
