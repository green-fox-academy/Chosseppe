package com.greenfox.listtodomysql.controllers;

import com.greenfox.listtodomysql.services.MyToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ToDoController {

    private MyToDoService myToDoService;

    @Autowired
    public ToDoController(MyToDoService myToDoService) {
        this.myToDoService = myToDoService;
    }

    @GetMapping("/todo")
    public String showIndex(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive){
        if(isActive != null){
            model.addAttribute("myToDos", myToDoService.findByIsActive(isActive));
        }else {
            model.addAttribute("myToDos", myToDoService.findAll());
        }
        return "index";

    }


}
