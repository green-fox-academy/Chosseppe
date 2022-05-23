package com.greenfoxaccademy.frontend.controllers;

import com.greenfoxaccademy.frontend.models.Doubling;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendRestController {


    @GetMapping({"/doubling", "/doubling/"})
    public ResponseEntity doubling(@RequestParam(required = false, name = "input") Integer input) {
        if (input == null) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body("{\"error\": \"Please provide an input!\"}");
        } else {
            Doubling doubling = new Doubling(input);
            return new ResponseEntity<>(doubling, HttpStatus.OK);
        }
    }
}
