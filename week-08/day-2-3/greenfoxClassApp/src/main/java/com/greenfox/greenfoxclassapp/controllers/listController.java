package com.greenfox.greenfoxclassapp.controllers;

import com.greenfox.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class listController {

    private StudentService studentService;

    @Autowired
    public listController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping("/gfa/list")
    public String showListOfStudents(Model model){
        model.addAttribute("students", studentService.findAll());
        return "list";
    }
}
