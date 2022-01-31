package com.example.hellodiproject.color;

import com.example.hellodiproject.helloWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class BlueColor implements MyColor {

    private Printer myPrinter;

    @Autowired
    public BlueColor(Printer myPrinter) {
        this.myPrinter = myPrinter;
    }

    public void printColor(){
        //System.out.println("\033[0;34m" + "It is blue in color..." + "\033[0m");
        myPrinter.log("\033[0;34m It is blue in color... \033[0m");
    }

}