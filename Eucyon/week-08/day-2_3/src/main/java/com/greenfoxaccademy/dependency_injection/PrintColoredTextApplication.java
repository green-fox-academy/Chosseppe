package com.greenfoxaccademy.dependency_injection;

import com.greenfoxaccademy.dependency_injection.interfaces.MyColorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PrintColoredTextApplication implements CommandLineRunner {

    MyColorInterface color;

    @Autowired
    public PrintColoredTextApplication(MyColorInterface color){
        color.printColor();

    }

    @RequestMapping("/")
    public void index(){
        color.printColor();
    }

    public static void main(String[] args) {SpringApplication.run(PrintColoredTextApplication.class, args);}

    @Override
    public void run(String... args) throws Exception {

    }
}
