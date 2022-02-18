package com.example.hellodiproject.controllers;

import com.example.hellodiproject.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaesarEncoderController {

    private UtilityService utilityService;

    @Autowired
    public CaesarEncoderController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful/encoder")
    public String getCaesarEncoding(@RequestParam String text, @RequestParam int number,  Model model) {
        model.addAttribute("caesarFox", utilityService.caesar(text, number));
        return "caesarcipher";
    }
}
