package com.greenfoxaccademy.listingtodoh2.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "to_do")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private boolean urgent;
    private boolean done;

    public Todo(String title, boolean done , boolean urgent){
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }

    public Todo(String title){this.title = title;}

    public Todo(){}
}
