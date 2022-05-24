package com.greenfoxaccademy.frontend.controllers;

import com.greenfoxaccademy.frontend.models.Doubling;
import com.greenfoxaccademy.frontend.models.ErrorMessage;
import com.greenfoxaccademy.frontend.models.Greetings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BackendRestController {


    @GetMapping(value ="/doubling")
    public ResponseEntity doubling(@RequestParam(required = false, name = "input") Integer input) {
        if (input == null) {
            return ResponseEntity.status(200)
                    .body(new ErrorMessage("Please provide an input!"));
        } else {
            Doubling doubling = new Doubling(input);
            return ResponseEntity.status(200).body(doubling);
        }
    }

    @RequestMapping(value ="/greeter")
    public ResponseEntity greetings(@RequestParam(name = "name", required = false) String name,
                                    @RequestParam(name = "title", required = false) String title){
        if(name == null && title == null){
            return ResponseEntity.status(200)
                    .body(new ErrorMessage("Please provide a name and a title!"));
        }else if(name == null){
            return ResponseEntity.status(200)
                    .body(new ErrorMessage("Please provide a name!"));
        }else if(title == null){
            return ResponseEntity.status(200)
                    .body(new ErrorMessage("Please provide a title!"));
        }else{
            Greetings greet = new Greetings(name,title);
            return ResponseEntity.status(200)
                    .body("{\"welcome_message\": \"Oh, hi there " + greet.getName() + ", my dear "
                            + greet.getTitle() + "!\"}");
        }
    }

    @GetMapping(value ="/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable(name = "appendable") String append) {
        return ResponseEntity.status(200).body("{\"appended\": \" " + append + "a\"}");

    }
}
