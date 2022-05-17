package com.greenfoxaccademy.listingtodoh2.services;

import com.greenfoxaccademy.listingtodoh2.models.Todo;

import java.util.List;

public interface TodoService {

    List<Todo> findAll();

    List<Todo> findByIsActive(boolean isActive);


}
