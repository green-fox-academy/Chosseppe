package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloJoeRESTApp {


    @RequestMapping("/greetingYou")
    @ResponseBody
    public Greeting greeting(@RequestParam(name = "name") String name) {
        Greeting greets = new Greeting();
        greets.setContent("Hello " + name + "!");
        return greets;
    }

}
