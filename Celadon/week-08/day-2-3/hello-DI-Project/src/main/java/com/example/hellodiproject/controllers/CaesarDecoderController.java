package com.example.hellodiproject.controllers;

import com.example.hellodiproject.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaesarDecoderController {

    private UtilityService utilityService;

    @Autowired
    public CaesarDecoderController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful/decoder")
    public String getCaesarDecoding(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("caesarFox", utilityService.caesar(text, 0 - number));
        return "caesarcipher";
    }
}
