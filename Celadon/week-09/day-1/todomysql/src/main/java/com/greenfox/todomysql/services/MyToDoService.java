package com.greenfox.todomysql.services;

import com.greenfox.todomysql.models.ToDo;

import java.util.List;

public interface MyToDoService {

    List<ToDo> findAll();

}
