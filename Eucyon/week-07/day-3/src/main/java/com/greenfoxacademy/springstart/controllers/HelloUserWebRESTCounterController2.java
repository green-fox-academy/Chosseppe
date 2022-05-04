package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.method.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class HelloUserWebRESTCounterController2 {

    Greeting greetings = new Greeting();

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag",
            "Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste",
            "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao",
            "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte",
            "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo",
            "Sut Mae", "Sholem Aleychem", "Sawubona"};

    Random random = new Random();

    @RequestMapping(value = "/web/greeting3")
    public String greeting3(@RequestParam(name = "name") String name, Model model) {
        greetings.setContent(name);
        greetings.setId();
        int hello = random.nextInt(hellos.length -1);
        model.addAttribute("hello", hellos[hello]);
        model.addAttribute("name", greetings.getContent());
        model.addAttribute("id", greetings.getId());
        return "greeting3";
    }
}
