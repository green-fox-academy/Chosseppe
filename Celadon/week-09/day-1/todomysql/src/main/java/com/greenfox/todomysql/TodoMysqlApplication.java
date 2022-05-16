package com.greenfox.todomysql;

import com.greenfox.todomysql.models.ToDo;
import com.greenfox.todomysql.repositories.MyToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoMysqlApplication implements CommandLineRunner {

    private MyToDoRepository myToDoRepository;

    @Autowired
    public TodoMysqlApplication(MyToDoRepository myToDoRepository) {
        this.myToDoRepository = myToDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoMysqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        myToDoRepository.save(new ToDo("buy a bread"));
        myToDoRepository.save(new ToDo("go to the water"));
        myToDoRepository.save(new ToDo("learn harder"));
    }
}
