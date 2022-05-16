package com.greenfoxaccademy.listingtodoh2.services;

import com.greenfoxaccademy.listingtodoh2.models.Todo;
import lombok.Data;

public interface TodoService {

    Iterable<Todo> findAll();

    void add(Todo todo);
}
