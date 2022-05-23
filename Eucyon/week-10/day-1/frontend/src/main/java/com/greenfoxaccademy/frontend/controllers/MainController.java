package com.greenfoxaccademy.frontend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

    @RequestMapping(value = "/")
    public String showMainPage(){return "index";}
}
