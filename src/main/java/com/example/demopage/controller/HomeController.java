package com.example.demopage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        System.out.println("landed for index.html...");
        return "index.html";
    }
}
