package com.greenfoxaccademy.programmerfoxclub.controllers;

import com.greenfoxaccademy.programmerfoxclub.models.Fox;
import com.greenfoxaccademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    private FoxService foxService;

    @Autowired
    LoginController(FoxService foxService){this.foxService = foxService;}

    @RequestMapping(value = "/login")
    public String homePageShow(){
        return "login";
    }

    @PostMapping("login/load")
    public String saveNewStudent(Model model, @ModelAttribute("name") String name){
        if(foxService.findName(name)) {
            model.addAttribute("fox", foxService.postFox(name));
            return "index";
        }else{
            return "login";
        }

    }
}
