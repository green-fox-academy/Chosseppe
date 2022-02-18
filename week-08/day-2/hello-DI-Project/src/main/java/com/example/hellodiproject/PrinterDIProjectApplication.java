package com.example.hellodiproject;

import com.example.hellodiproject.services.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinterDIProjectApplication implements CommandLineRunner {


    @Autowired
    public PrinterDIProjectApplication(PrinterService printerService){
        printerService.log("Ola senor!");

    }

    public static void main(String[] args) {
        SpringApplication.run(PrinterDIProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
    }
}
