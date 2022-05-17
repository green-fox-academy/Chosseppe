package com.greenfoxaccademy.listingtodoh2.models;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "To_Do")
@Data
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String title;
    public boolean urgent;
    public boolean done;

    public Todo(String title, boolean urgent , boolean done){
        this.title = title;
        this.urgent = urgent;
        this.done = done;}
    public Todo(){}


}
