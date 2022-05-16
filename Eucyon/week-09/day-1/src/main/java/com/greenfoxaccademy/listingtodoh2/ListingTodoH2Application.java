package com.greenfoxaccademy.listingtodoh2;

import com.greenfoxaccademy.listingtodoh2.models.Todo;
import com.greenfoxaccademy.listingtodoh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingTodoH2Application implements CommandLineRunner {

    private final TodoRepository todoRepository;

    @Autowired
    public ListingTodoH2Application(TodoRepository todoRepository){this.todoRepository = todoRepository;}


    public static void main(String[] args) {
        SpringApplication.run(ListingTodoH2Application.class, args);
    }


    @Override
    public void run(String... args) {
        todoRepository.save(new Todo("buy a bread"));
        todoRepository.save(new Todo("go to the water"));
        todoRepository.save(new Todo("learn harder"));
    }

}
