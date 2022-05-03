package com.example.hellodiproject.controllers;

import com.example.hellodiproject.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailValidatorController{

    private UtilityService utilityService;

    @Autowired
    public EmailValidatorController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful/email")
    public String getValidateEmail(@RequestParam String email,  Model model) {
        model.addAttribute("validateEmail", utilityService.validateEmail(email));
        return "emailvalidation";
    }
}
