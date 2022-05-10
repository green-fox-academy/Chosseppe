package com.greenfoxaccademy.dependency_injection.services.colorservices;

import com.greenfoxaccademy.dependency_injection.interfaces.MyColorInterface;
import com.greenfoxaccademy.dependency_injection.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlueColorService implements MyColorInterface {

    private PrinterService printer;

    @Autowired
    public BlueColorService(PrinterService printer){
        this.printer = printer;
    }

    public void printColor(){
        printer.log("\033[0;34m It is red in color... \033[0m");
    }
}
