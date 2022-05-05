package com.greenfoxaccademy.bankofsimba.controllers;

import com.greenfoxaccademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DecimalFormat;

@Controller
public class BankAccountController {

    BankAccount bankAccount = new BankAccount("lion", "Simba", 2000.00);

    @RequestMapping(value="/show")
    public String defaultShowing(Model model){
        model.addAttribute("bankAccount", this.bankAccount);
        return "default";
    }
}
