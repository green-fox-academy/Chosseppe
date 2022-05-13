package com.greenfoxaccademy.programmerfoxclub.controllers;

import com.greenfoxaccademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MainController {

    private Fox fox = new Fox("Mr. Fox", Arrays.asList("pizza", "lemonade"), Arrays.asList("HTML", "Java"));

    @RequestMapping(value = "/")
    public String homePageShow(Model model){
        model.addAttribute("fox", fox);
        return "index";
    }

}
