package com.example.hellodiproject.services.colors;

import com.example.hellodiproject.interfaces.MyColor;
import com.example.hellodiproject.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class RedColorService implements MyColor {

    @Autowired
    private PrinterService myPrinterService;

    public RedColorService(PrinterService myPrinterService) {
        this.myPrinterService = myPrinterService;
    }

    public void printColor(){
        //System.out.println("\033[0;31m" + "It is red in color..." + "\033[0m");
        myPrinterService.log("\033[0;31m It is red in color... \033[0m");
    }

}
