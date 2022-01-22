package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    long id;
    String content;


    public GreetingController(){
        this.id = 1;
        this.content = "Hello World!";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
