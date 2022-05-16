package com.greenfoxaccademy.listingtodoh2.services;

import com.greenfoxaccademy.listingtodoh2.models.Todo;

public interface TodoService {

    Iterable<Todo> findAll();
}
