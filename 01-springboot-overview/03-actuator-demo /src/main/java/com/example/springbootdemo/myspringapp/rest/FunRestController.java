package com.example.springbootdemo.myspringapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return a hello world

    @GetMapping("/")
    public String sayHello(){
        return "Hello Spring application how you doing ";
    }


    //expose a new endpoint for - workout
    @GetMapping("/workout")
    public String getWorkout(){
        return "Lats pulldown";
    }

    //expose a new endpoint for fortune

    @GetMapping("/fortune")
    public String getFortune(){
        return "Lucky day";
    }
}
