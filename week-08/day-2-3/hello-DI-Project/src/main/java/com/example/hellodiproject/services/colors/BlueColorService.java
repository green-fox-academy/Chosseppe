package com.example.hellodiproject.services.colors;

import com.example.hellodiproject.interfaces.MyColor;
import com.example.hellodiproject.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class BlueColorService implements MyColor {

    private PrinterService myPrinterService;

    @Autowired
    public BlueColorService(PrinterService myPrinterService) {
        this.myPrinterService = myPrinterService;
    }

    public void printColor(){
        //System.out.println("\033[0;34m" + "It is blue in color..." + "\033[0m");
        myPrinterService.log("\033[0;34m It is blue in color... \033[0m");
    }

}