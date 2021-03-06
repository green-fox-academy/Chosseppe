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
        todoRepository.save(new Todo("daily task", false, false));
        todoRepository.save(new Todo("make the beds", true, true));
        todoRepository.save(new Todo("do the washing up", true, false));
        todoRepository.save(new Todo("clean the bathroom and the kitchen", true, true));
        todoRepository.save(new Todo("wipe all surfaces with a cloth", true, false));
        todoRepository.save(new Todo("remove the grease", true, true));
        todoRepository.save(new Todo("tidy up", false, false));
        todoRepository.save(new Todo("throw away the rubbish", true, true));
        todoRepository.save(new Todo("broom", true, false));
        todoRepository.save(new Todo("sweep the floor", true, true));
        todoRepository.save(new Todo("wash the floor", true, false));
        todoRepository.save(new Todo("mop", true, true));
        todoRepository.save(new Todo("vacuum the carpet", false, false));
        todoRepository.save(new Todo("vacuum cleaner/hoover", true, true));
        todoRepository.save(new Todo("do the washing up", true, false));
    }

}
