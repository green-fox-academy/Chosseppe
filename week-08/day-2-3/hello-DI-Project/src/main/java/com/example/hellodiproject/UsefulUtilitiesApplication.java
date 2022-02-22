package com.example.hellodiproject;

import com.example.hellodiproject.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class UsefulUtilitiesApplication implements CommandLineRunner {

    private UtilityService utilityService;

    @Autowired
    public UsefulUtilitiesApplication(UtilityService utilityService){
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful")
    @ResponseBody
    public void index(){

    }

    public static void main(String[] args) {
        SpringApplication.run(UsefulUtilitiesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
