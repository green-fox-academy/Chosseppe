package com.greenfoxaccademy.greenfoxclassapp.controllers;

import com.greenfoxaccademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {

    private StudentService studser;

    @Autowired
    public StatusController(StudentService studser) {this.studser = studser;}

    @RequestMapping("/gfa/count")
    public String showNumberOfStudents(Model model){
        model.addAttribute("status", "There is/are " + studser.findAll().size() + " students");
        return "status";
    }


}
