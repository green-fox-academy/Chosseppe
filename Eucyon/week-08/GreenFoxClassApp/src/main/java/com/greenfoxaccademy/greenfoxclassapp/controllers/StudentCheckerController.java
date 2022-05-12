package com.greenfoxaccademy.greenfoxclassapp.controllers;

import com.greenfoxaccademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentCheckerController {

    private StudentService studser;

    @Autowired
    public StudentCheckerController(StudentService studser){this.studser = studser;}

    @PostMapping("gfa/check")
    public String saveNewStudent(Model model, @ModelAttribute("name") String name){
        if(studser.findAll().contains(name)) {
            model.addAttribute("check", "Student with name " + name + " is in list");
        }else if ( name.length() == 0){
            model.addAttribute("check", " ");
        }else{
            model.addAttribute("check", "Student with name " + name + " is not in list");
        }
        return "check";
    }

}
