package com.greenfox.listtodomysql.services;


import com.greenfox.listtodomysql.models.ToDo;

import java.util.List;

public interface MyToDoService {

    List<ToDo> findAll();

    List<ToDo> findByIsActive(boolean isActive);

}
