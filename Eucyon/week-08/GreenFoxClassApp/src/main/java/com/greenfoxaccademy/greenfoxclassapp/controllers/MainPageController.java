package com.greenfoxaccademy.greenfoxclassapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {

    @RequestMapping(value = "/gfa")
    public String mainPage(){return "index";}
}
