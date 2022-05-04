package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.method.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloUserWebRESTCounterController {

    Greeting greetings = new Greeting();

    @RequestMapping(value = "/web/greeting2")
    public String greeting2(@RequestParam(name = "name") String name, Model model) {
        greetings.setContent(name);
        greetings.setId();
        model.addAttribute("name", greetings.getContent());
        model.addAttribute("id", greetings.getId());
        return "greeting2";
    }
}
