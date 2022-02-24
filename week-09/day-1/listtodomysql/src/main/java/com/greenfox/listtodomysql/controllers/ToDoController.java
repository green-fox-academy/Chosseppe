package com.greenfox.listtodomysql.controllers;

import com.greenfox.listtodomysql.services.MyToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ToDoController {

    private MyToDoService myToDoService;

    @Autowired
    public ToDoController(MyToDoService myToDoService) {
        this.myToDoService = myToDoService;
    }

    @GetMapping("/todo")
    public String index(Model model){
        model.addAttribute("myToDos", myToDoService.findAll());
        return "index";

    }


}
