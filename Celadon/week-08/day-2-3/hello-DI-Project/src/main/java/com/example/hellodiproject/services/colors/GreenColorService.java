package com.example.hellodiproject.services.colors;

import com.example.hellodiproject.interfaces.MyColor;
import com.example.hellodiproject.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreenColorService implements MyColor {

    @Autowired
    private PrinterService myPrinterService;

    public GreenColorService(PrinterService myPrinterService) {
        this.myPrinterService = myPrinterService;
    }

    public void printColor(){
        //System.out.println("\033[0;32m" + "It is green in color..." + "\033[0m");
        myPrinterService.log("\033[0;32m It is green in color... \033[0m");
    }

}
