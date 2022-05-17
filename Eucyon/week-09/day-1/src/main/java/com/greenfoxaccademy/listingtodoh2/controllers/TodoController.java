package com.greenfoxaccademy.listingtodoh2.controllers;

import com.greenfoxaccademy.listingtodoh2.models.Todo;
import com.greenfoxaccademy.listingtodoh2.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping("/todo")
    public String index(@RequestParam(name = "isActive", required = false)boolean isActive, Model model){
        if(!isActive) {
            model.addAttribute("myToDos", todoService.findAll());
        }else{
            model.addAttribute("myToDos", todoService.findByIsActive(isActive));
        }
        return "index";

    }
}