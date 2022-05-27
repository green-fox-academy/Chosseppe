package com.greenfoxaccademy.frontend.controllers;

import com.greenfoxaccademy.frontend.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BackendRestController {


    @RequestMapping(value ="/doubling")
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

    @RequestMapping(value ="/appenda/{appendable}")
    public ResponseEntity appendA(@PathVariable(name = "appendable") String append) {
        return ResponseEntity.status(200).body("{\"appended\": \" " + append + "a\"}");

    }

    @RequestMapping(value ="/dountil/{operation}")
    public ResponseEntity doUntil(@PathVariable(name = "operation") String operation,
                                  @RequestParam(name = "until", required = false) int until) {
        DoUntil task = new DoUntil(until, operation);
        if (task.operationResult() == null) {
                return ResponseEntity.status(200)
                        .body(new ErrorMessage("Please provide a number!"));
            } else {
                return ResponseEntity.status(200).body("{\"result\": \"" + task.operationResult() + "\"}");
            }
        }

    @RequestMapping(value = "/arrays")
    public ResponseEntity arrays(@RequestParam(name = "what", required = false) String what,
                                 @RequestParam(name = "numbers", required = false) ArrayList<Integer> numbers){
        Array task = new Array(what, numbers);
        if(what == null || numbers == null){
            return ResponseEntity.status(200)
                    .body(new ErrorMessage("Please provide what to do with the numbers!"));
        }else{
            return ResponseEntity.status(200).body("{\"result\": \"" + task.result() + "\"}");
        }
    }

}
