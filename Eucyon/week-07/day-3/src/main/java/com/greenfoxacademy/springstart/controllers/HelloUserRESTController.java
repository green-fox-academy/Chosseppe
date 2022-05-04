package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.method.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloUserRESTController {

    Greeting greeting = new Greeting();


    @RequestMapping(value = "/greetings")
    @ResponseBody
    public Greeting greeting(@RequestParam(name = "name") String name){
        greeting.setContent("Hello " + name +"!");
        return greeting;
    }
}
