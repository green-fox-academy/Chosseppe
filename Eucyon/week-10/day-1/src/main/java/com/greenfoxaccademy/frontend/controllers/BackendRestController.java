package com.greenfoxaccademy.frontend.controllers;

import com.greenfoxaccademy.frontend.models.Doubling;
import com.greenfoxaccademy.frontend.models.Greetings;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendRestController {


    @GetMapping(value ="/doubling")
    public ResponseEntity doubling(@RequestParam(required = false, name = "input") Integer input) {
        if (input == null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("{\"error\": \"Please provide an input!\"}");
        } else {
            Doubling doubling = new Doubling(input);
            return new ResponseEntity<>(doubling, HttpStatus.OK);
        }
    }

    @GetMapping(value = "/greeting")
    public ResponseEntity greetings(@RequestParam(name = "name", required = false) String name,
                                    @RequestParam(name = "title", required = false) String title){
        if(name == null && title == null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body("{\"error\": \"Please provide a name and a title!\"}");
        }else if(name == null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body("{\"error\": \"Please provide a name!\"}");
        }else if(title == null){
            return ResponseEntity.status(HttpStatus.OK)
                    .body("{\"error\": \"Please provide a title!\"}");
        }else{
            Greetings greet = new Greetings(name,title);
            return ResponseEntity.status(HttpStatus.OK)
                    .body("{\"welcome_message\": \"Oh, hi there " + greet.getName() + ", my dear "
                            + greet.getTitle() + "!\"}");
        }
    }
}
