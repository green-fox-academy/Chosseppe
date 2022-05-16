package com.example.todoh2.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ToDos")
@Data
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String title;

    private boolean urgent = false;

    private boolean done = false;

    public ToDo(String title) {
        this.title = title;
    }
    public ToDo(){}
}
