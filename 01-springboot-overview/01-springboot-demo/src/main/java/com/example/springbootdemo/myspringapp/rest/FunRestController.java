package com.example.springbootdemo.myspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return a hello world

    @GetMapping("/")
    public String sayHello(){
        return "Hello Spring application ";
    }
}
