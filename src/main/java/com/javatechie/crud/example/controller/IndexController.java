package com.javatechie.crud.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Welcome. This is a demo application made by AKSHARA PRAMOD that performs crud operations using spring boot restful webservices. The databse javatechie consists of 4 attributes id,name, quantity, price. Let us see the further operations.";
    }
}