package com.greenfoxaccademy.dependency_injection;

import com.greenfoxaccademy.dependency_injection.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class UsefulUtilityApplication implements CommandLineRunner {

    private UtilityService utility;

    @Autowired
    public UsefulUtilityApplication(UtilityService utilityService){
        this.utility = utilityService;
    }

    @RequestMapping("/useful")
    @ResponseBody
    public void index(){

    }

    public static void main(String[] args) {
        SpringApplication.run(UsefulUtilityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
