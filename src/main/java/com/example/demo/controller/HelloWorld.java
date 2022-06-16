package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @Value("${test.hello}")
    private String testHello;

    @Value("${test.hello2:DefaultTest}")
    private String testHello2;

    @GetMapping("/demo")
    public String helloWorld(){
        return  "helloWorld"+testHello;
    }

    @PostMapping("/demo2")
    public String demo2(String name){
        return  "post :"+name;
    }
}
