package com.greenfoxaccademy.dependency_injection.controllers;

import com.greenfoxaccademy.dependency_injection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaesarDecodingController {

    private UtilityService utility;

    @Autowired
    CaesarDecodingController(UtilityService utility){
        this.utility = utility;
    }

    @RequestMapping("/useful/decoder")
    public String getCaesarDecoding(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("caesarText", utility.caesar(text, 0 - number));
        return "caesarcipher";
    }
}
