package com.greenfox.greenfoxclassapp.controllers;

import com.greenfox.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class addNewStudentController {

    private StudentService studentService;

    @Autowired
    public addNewStudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/gfa/add")
    public String addNewStudent(){
        return "addition";
    }

    @PostMapping("gfa/add/save")
    public String saveNewStudent(Model model, @ModelAttribute("name") String name){
        if(!studentService.findAll().contains(name)) {
            studentService.save(name);
        }
            model.addAttribute("students", studentService.findAll());
        return "list";
    }
}
