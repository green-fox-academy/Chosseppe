package com.greenfox.listtodomysql;

import com.greenfox.listtodomysql.models.ToDo;
import com.greenfox.listtodomysql.repositories.MyToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListTodoMysqlApplication implements CommandLineRunner {

    private MyToDoRepository myToDoRepository;

    @Autowired
    public ListTodoMysqlApplication(MyToDoRepository myToDoRepository) {
        this.myToDoRepository = myToDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ListTodoMysqlApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        myToDoRepository.save(new ToDo("daily task", false, false));
        myToDoRepository.save(new ToDo("make the beds", true, true));
        myToDoRepository.save(new ToDo("do washing up", true, false));
        myToDoRepository.save(new ToDo("clean the bathroom and the kitchen", true, true));
        myToDoRepository.save(new ToDo("wipe all the surfaces with a cloth", true, false));
        myToDoRepository.save(new ToDo("remove the grease", true, true));
        myToDoRepository.save(new ToDo("tidy up", false , false));
        myToDoRepository.save(new ToDo("throw away the rubbish", true , true));
        myToDoRepository.save(new ToDo("broom", true , false));
        myToDoRepository.save(new ToDo("sweep the floor", true, true));
        myToDoRepository.save(new ToDo("wash the floor", true, false));
        myToDoRepository.save(new ToDo("mop", true , true));
        myToDoRepository.save(new ToDo("vacuum the carpet", false, false));
        myToDoRepository.save(new ToDo("vacuum cleaner/hoover", true , true));
        myToDoRepository.save(new ToDo("dust the furniture", true , false));
    }
}
