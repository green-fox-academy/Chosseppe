package com.example.hellodiproject.usefulutilities.controllers;

import com.example.hellodiproject.usefulutilities.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class ColoredBackgroundController {

    private UtilityService utilityService;

    @Autowired
    public ColoredBackgroundController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful/colored")
    public String randomColor(Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "colored";
    }
}
