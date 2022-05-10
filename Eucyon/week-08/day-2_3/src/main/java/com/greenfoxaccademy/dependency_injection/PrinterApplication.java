package com.greenfoxaccademy.dependency_injection;

import com.greenfoxaccademy.dependency_injection.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterApplication implements CommandLineRunner {

    @Autowired
    PrinterApplication(PrinterService printer){
        printer.log("Ahoj Jozef!");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpellcheckerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
    }
}
