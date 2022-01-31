package com.example.hellodiproject.color;

import com.example.hellodiproject.helloWorld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreenColor implements MyColor {

    @Autowired
    private Printer myPrinter;

    public GreenColor(Printer myPrinter) {
        this.myPrinter = myPrinter;
    }

    public void printColor(){
        //System.out.println("\033[0;32m" + "It is green in color..." + "\033[0m");
        myPrinter.log("\033[0;32m It is green in color... \033[0m");
    }

}
