package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.method.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    Greeting greeting = new Greeting();


    @RequestMapping(value = "/greeting")
    @ResponseBody
    public Greeting greeting(){
        greeting.setContent("Hello World again!");
        return greeting;
    }



}
