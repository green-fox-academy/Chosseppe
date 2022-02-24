package com.greenfox.listtodomysql.services;

import com.greenfox.listtodomysql.models.ToDo;
import com.greenfox.listtodomysql.repositories.MyToDoRepository;
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

    @Override
    public List<ToDo> findByIsActive(boolean isActive) {
        return myToDoRepository.findByIsActive(!isActive);
    }
}
