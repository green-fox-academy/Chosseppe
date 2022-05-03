package com.example.todoh2.services;

import com.example.todoh2.models.ToDo;
import com.example.todoh2.repositories.MyToDoRepository;
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
