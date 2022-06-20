package com.example.demo.controller;

import com.example.demo.domain.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloWorld {

    @Value("${test.hello}")
    private String testHello;

    @Resource
    private TestService testService;

    @Value("${test.hello2:DefaultTest}")
    private String testHello2;

    @GetMapping("/demo")
    public String helloWorld() {
        return "helloWorld123" + testHello;
    }

    @PostMapping("/demo2")
    public String demo2(String name) {
        return "post :" + name;
    }

    @GetMapping("/testMybatis/list")
    public List<Test> testMybatisList() {
        return testService.list();
    }
}
