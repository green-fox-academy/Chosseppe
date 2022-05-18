package com.greenfoxaccademy.listingtodoh2.controllers;

import com.greenfoxaccademy.listingtodoh2.models.Todo;
import com.greenfoxaccademy.listingtodoh2.repositories.TodoRepository;
import com.greenfoxaccademy.listingtodoh2.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddNewTodoController {

    private TodoService todoService;
    private TodoRepository todoRepository;

    @Autowired
    public AddNewTodoController(TodoRepository todoRepository, TodoService todoService){
        this.todoRepository = todoRepository;
        this.todoService = todoService;
    }

    @GetMapping("/todo/add")
    public String addNewTodo(){
        return "create";
    }

    @PostMapping("todo/add/save")
    public String saveNewStudent(Model model, @ModelAttribute("todo") String text){
        todoRepository.save(new Todo(text));
        model.addAttribute("ToDos", todoService.findAll());
        return "index";
    }
}
