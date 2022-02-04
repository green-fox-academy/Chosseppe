package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRESTController {


    @RequestMapping("/greeting")
    public GreetingController greeting(){
        GreetingController greets = new GreetingController();
        //greets.setContent("Hello World!");
        return greets;
    }
}
