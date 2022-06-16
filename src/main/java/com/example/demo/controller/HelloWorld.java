package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {
    @GetMapping("/demo")
    public String helloWorld(){
        return  "helloWorld123";
    }

    @PostMapping("/demo2")
    public String demo2(String name){
        return  "post :"+name;
    }
}
