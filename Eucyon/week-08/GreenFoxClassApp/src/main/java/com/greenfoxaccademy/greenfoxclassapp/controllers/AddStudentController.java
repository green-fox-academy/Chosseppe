package com.greenfoxaccademy.greenfoxclassapp.controllers;

import com.greenfoxaccademy.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddStudentController {

    private StudentService studser;

    @Autowired
    AddStudentController(StudentService studser){
        this.studser = studser;
    }

    @RequestMapping(value = "/gfa/add")
    public String addNewStudent(){
        return "addition";
    }

    @PostMapping("gfa/add/save")
    public String saveNewStudent(Model model, @ModelAttribute("name") String name){
        if(!studser.findAll().contains(name)) {
            studser.save(name);
        }
        model.addAttribute("students", studser.findAll());
        return "list";
    }
}
