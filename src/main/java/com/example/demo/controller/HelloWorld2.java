package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld2 {
    @RequestMapping("/demo")
    public String helloWorld(){
        return  "helloWorld";
    }
}
