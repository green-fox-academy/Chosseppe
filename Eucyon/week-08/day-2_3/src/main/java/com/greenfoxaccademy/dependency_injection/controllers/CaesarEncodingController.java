package com.greenfoxaccademy.dependency_injection.controllers;

import com.greenfoxaccademy.dependency_injection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaesarEncodingController {

    private UtilityService utility;

    @Autowired
    CaesarEncodingController(UtilityService utility){
        this.utility = utility;
    }

    @GetMapping("/useful/encoder")
    public String getCaesarEncoding(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("caesarText", utility.caesar(text, number));
        return "caesarcipher";
    }
}
