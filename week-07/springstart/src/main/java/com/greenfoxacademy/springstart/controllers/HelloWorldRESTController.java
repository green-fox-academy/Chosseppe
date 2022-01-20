package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRESTController {



    @RequestMapping("/greeting")
    public Greeting greeting(){
        Greeting greets = new Greeting();
        return greets;
    }
}
