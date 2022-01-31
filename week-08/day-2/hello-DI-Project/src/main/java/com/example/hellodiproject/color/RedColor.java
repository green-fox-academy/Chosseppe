package com.example.hellodiproject.color;

import com.example.hellodiproject.helloWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class RedColor implements MyColor {

    @Autowired
    private Printer myPrinter;

    public RedColor(Printer myPrinter) {
        this.myPrinter = myPrinter;
    }

    public void printColor(){
        //System.out.println("\033[0;31m" + "It is red in color..." + "\033[0m");
        myPrinter.log("\033[0;31m It is red in color... \033[0m");
    }

}
