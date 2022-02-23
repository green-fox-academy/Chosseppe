package com.example.todoh2;

import com.example.todoh2.models.ToDo;
import com.example.todoh2.repositories.MyToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoH2Application implements CommandLineRunner {

    private MyToDoRepository myToDoRepository;

    @Autowired
    public TodoH2Application(MyToDoRepository myToDoRepository) {
        this.myToDoRepository = myToDoRepository;
    }




    public static void main(String[] args) {
        SpringApplication.run(TodoH2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    myToDoRepository.save(new ToDo("buy a bread"));
    myToDoRepository.save(new ToDo("go to the water"));
    myToDoRepository.save(new ToDo("learn harder"));
    }
}
