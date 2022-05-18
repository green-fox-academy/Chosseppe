package com.greenfoxaccademy.listingtodoh2.controllers;

import com.greenfoxaccademy.listingtodoh2.repositories.TodoRepository;
import com.greenfoxaccademy.listingtodoh2.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static java.lang.Long.parseLong;

@Controller
public class TodoController {

    private final TodoService todoService;
    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoService todoService, TodoRepository todoRepository) {
        this.todoService = todoService;
        this.todoRepository = todoRepository;
    }

        @RequestMapping("/todo")
        public String homePage(@RequestParam(name = "isActive", required = false) Boolean isActive, Model model) {
            if (isActive == null) {
                model.addAttribute("ToDos", todoService.findAll());
            } else {
                model.addAttribute("ToDos", todoService.findByIsActive(isActive));
            }
            return "index";
        }


    @GetMapping("/todo/{id}/delete")
    public String deleteTodo(@PathVariable Long id, Model model){
        todoRepository.deleteById(id);
        model.addAttribute("ToDos", todoRepository.findAll());
        return "redirect:/todo";
    }
}