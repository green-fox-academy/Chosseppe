package com.greenfoxaccademy.listingtodoh2.models;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "To_Do")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private boolean urgent = false;
    private boolean done = false;

    public Todo(String title){this.title = title;}
    public Todo(){}

}
