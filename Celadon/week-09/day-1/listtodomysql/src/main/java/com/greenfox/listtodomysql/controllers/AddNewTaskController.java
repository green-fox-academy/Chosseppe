package com.greenfox.listtodomysql.controllers;

import com.greenfox.listtodomysql.services.MyToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AddNewTaskController {

    private MyToDoService myToDoService;

    @Autowired
    public AddNewTaskController(MyToDoService myToDoService){
        this.myToDoService = myToDoService;
    }
}
