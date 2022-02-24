package com.greenfox.todomysql;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {



    
    public static void main(String[] args) {
        SpringApplication.run(TodomysqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        myToDoRepository.save(new com.example.todoh2.models.ToDo("buy a bread"));
        myToDoRepository.save(new com.example.todoh2.models.ToDo("go to the water"));
        myToDoRepository.save(new com.example.todoh2.models.ToDo("learn harder"));
    }
}
