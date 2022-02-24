package com.greenfox.listtodomysql;

import com.greenfox.listtodomysql.models.ToDo;
import com.greenfox.listtodomysql.repositories.MyToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodomysqlApplication implements CommandLineRunner {

    private MyToDoRepository myToDoRepository;

    @Autowired
    public TodomysqlApplication(MyToDoRepository myToDoRepository) {
        this.myToDoRepository = myToDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodomysqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        myToDoRepository.save(new ToDo("buy a bread"));
        myToDoRepository.save(new ToDo("go to the water"));
        myToDoRepository.save(new ToDo("learn harder"));
    }
}
