package com.greenfoxaccademy.dependency_injection.services.colorservices;

import com.greenfoxaccademy.dependency_injection.interfaces.MyColorInterface;
import com.greenfoxaccademy.dependency_injection.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class RedColorService implements MyColorInterface {

    private PrinterService printer;

    @Autowired
    public RedColorService(PrinterService printer){
        this.printer = printer;
    }

    public void printColor(){
        printer.log("\033[0;31m It is red in color... \033[0m");
    }
}
