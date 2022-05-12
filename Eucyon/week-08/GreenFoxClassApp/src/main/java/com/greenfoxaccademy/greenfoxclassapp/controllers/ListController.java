package com.greenfoxaccademy.greenfoxclassapp.controllers;

import com.greenfoxaccademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

    private StudentService studser;

    @Autowired
    public ListController(StudentService studser) {this.studser = studser;}

    @RequestMapping("/gfa/list")
    public String showListOfStudents(Model model){
        model.addAttribute("students", studser.findAll());
        return "list";
    }

}
