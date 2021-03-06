package com.greenfox.listtodomysql.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "todo")
@Data
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String title;

    private boolean urgent = false;

    private boolean done = false;

    public ToDo(String title, boolean done, boolean urgent) {
        this.title = title;
        this.done = done;
        this.urgent = urgent;
    }

    public ToDo(){}
}
