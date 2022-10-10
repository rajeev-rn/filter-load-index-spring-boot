package com.example.demopage.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController1 {

    @GetMapping("/home")
    public String home(){
        System.out.println("inside home controller 2s");
        return "index.html";
    }
}
