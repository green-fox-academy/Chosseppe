package com.greenfox.greenfoxclassapp.controllers;

import com.greenfox.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class statusController {

    private StudentService studentService;

    @Autowired
    public statusController(StudentService studentService){
        this.studentService = studentService;

    }

    @RequestMapping("/gfa/count")
    public String showNumberOfStudents(Model model){
        model.addAttribute("status", "There is/are " + studentService.findAll().size() + " students");
        return "status";
    }
}
