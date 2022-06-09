package com.greenfoxaccademy.reddit.controllers;

import com.greenfoxaccademy.reddit.models.User;
import com.greenfoxaccademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationController {

    private UserService userService;

    @Autowired
    RegistrationController(UserService userService){
        this.userService=userService;
    }


    @GetMapping(value = "/register")
    public String signupForm(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }
    @PostMapping(value = "/register/new_user")
    public String signupForm(User user){
        userService.save(user);
        return "logging";
    }
}
