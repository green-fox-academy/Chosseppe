package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloJoeRestController {


    @RequestMapping("/greetingYou")
    @ResponseBody
    public GreetingController greeting(@RequestParam(name = "name") String name) {
        GreetingController greets = new GreetingController();
        greets.setContent("Hello " + name + "!");
        return greets;
    }

}
