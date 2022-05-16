package com.greenfoxaccademy.listingtodoh2.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private long id;

    @Column(name = "Title", nullable = false)
    private String title;
    private boolean urgent = false;
    private boolean done = false;

    public Todo(String title){this.title = title;}
    public Todo(){}

}
