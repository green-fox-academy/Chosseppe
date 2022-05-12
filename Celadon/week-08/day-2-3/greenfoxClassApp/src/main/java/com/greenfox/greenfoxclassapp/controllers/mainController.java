package com.greenfox.greenfoxclassapp.controllers;

import com.greenfox.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

    private StudentService studentService;

    @Autowired
    public mainController(StudentService studentService){
        this.studentService = studentService;

    }

    @RequestMapping("/gfa")
    public String mainPage(){
        return "index";
    }



}
