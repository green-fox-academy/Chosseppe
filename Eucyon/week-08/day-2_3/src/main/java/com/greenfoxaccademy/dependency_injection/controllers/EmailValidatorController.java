package com.greenfoxaccademy.dependency_injection.controllers;

import com.greenfoxaccademy.dependency_injection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailValidatorController {

    private UtilityService utility;

    @Autowired
    EmailValidatorController(UtilityService utility){
        this.utility = utility;
    }

    @GetMapping("/useful/email")
    public String getValidateEmail(@RequestParam String email, Model model) {
        model.addAttribute("validateEmail", utility.validateEmail(email));
        return "emailvalidator";
    }
}
