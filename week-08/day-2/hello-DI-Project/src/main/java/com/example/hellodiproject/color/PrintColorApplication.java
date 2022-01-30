package com.example.hellodiproject.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PrintColorApplication implements CommandLineRunner {

    MyColor color;

    @Autowired
    public PrintColorApplication(MyColor color){
        color.printColor();

    }

    @RequestMapping("/")
    public void index(){
        color.printColor();
    }

    public static void main(String[] args) {SpringApplication.run(PrintColorApplication.class, args);}

    @Override
    public void run(String... args) throws Exception {

    }
}
