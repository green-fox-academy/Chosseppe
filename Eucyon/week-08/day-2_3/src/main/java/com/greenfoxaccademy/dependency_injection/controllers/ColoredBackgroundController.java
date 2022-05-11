package com.greenfoxaccademy.dependency_injection.controllers;

import com.greenfoxaccademy.dependency_injection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ColoredBackgroundController {

    private UtilityService utility;

    @Autowired
    ColoredBackgroundController(UtilityService utility){
        this.utility = utility;
    }

    @RequestMapping("/useful/colored")
    public String randomColor(Model model) {
        model.addAttribute("randomColor", utility.randomColor());
        return "colored";
    }
}
