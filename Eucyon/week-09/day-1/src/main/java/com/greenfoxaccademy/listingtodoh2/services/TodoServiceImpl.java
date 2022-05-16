package com.greenfoxaccademy.listingtodoh2.services;

import com.greenfoxaccademy.listingtodoh2.models.Todo;
import com.greenfoxaccademy.listingtodoh2.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    private final TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository){this.todoRepository = todoRepository;}

    @Override
    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll();
    }
}
