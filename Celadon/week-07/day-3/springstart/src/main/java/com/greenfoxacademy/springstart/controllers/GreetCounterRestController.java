package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class GreetCounterRestController {

    AtomicLong greetCounter = new AtomicLong();
    String content;
    long invisible;


    public GreetCounterRestController(){
        AtomicLong greetCounter = new AtomicLong();;
        this.content = "";
        invisible = 0;
    }


    public AtomicLong getGreetCounter() {
        return greetCounter;
    }

    public void setGreetCounter(long greetCount) {
        this.greetCounter.set(greetCount);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @RequestMapping("/greetingYouYou")
    @ResponseBody
    public GreetCounterRestController greeting(@RequestParam(name = "name") String name) {
        GreetCounterRestController greets = new GreetCounterRestController();
        invisible += 1;
        greets.setContent("Hello " + name + "!");
        greets.setGreetCounter(invisible);
        greets.getGreetCounter();
        return greets;
    }

}
