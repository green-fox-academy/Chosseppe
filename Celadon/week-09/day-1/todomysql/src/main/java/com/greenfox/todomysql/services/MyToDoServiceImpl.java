package com.greenfox.todomysql.services;

import com.greenfox.todomysql.models.ToDo;
import com.greenfox.todomysql.repositories.MyToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyToDoServiceImpl implements MyToDoService{

    private MyToDoRepository myToDoRepository;

    @Autowired
    public MyToDoServiceImpl(MyToDoRepository myToDoRepository){
        this.myToDoRepository = myToDoRepository;
    }

    @Override
    public List<ToDo> findAll() {
        return myToDoRepository.findAll();
    }
}
