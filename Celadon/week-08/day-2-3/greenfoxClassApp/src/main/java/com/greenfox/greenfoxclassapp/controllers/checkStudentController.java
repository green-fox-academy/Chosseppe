package com.greenfox.greenfoxclassapp.controllers;

import com.greenfox.greenfoxclassapp.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class checkStudentController {

    private StudentService studentService;

    @Autowired
    public checkStudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping(value = "/gfa/check")
    public String addNewStudent(){
        return "checker";
    }

    @PostMapping("gfa/check")
    public String saveNewStudent(Model model, @ModelAttribute("name") String name){
        if(studentService.findAll().contains(name)) {
            model.addAttribute("check", "Student with name " + name + " is in list");
        }else if ( name.length() == 0){
            model.addAttribute("check", " ");
        }else{
            model.addAttribute("check", "Student with name " + name + " is not in list");
        }
        return "checker";
    }
}
