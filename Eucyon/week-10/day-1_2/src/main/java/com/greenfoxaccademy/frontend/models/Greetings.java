package com.greenfoxaccademy.frontend.models;

import lombok.Data;

@Data
public class Greetings {

    private String name;
    private String title;

    public Greetings(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public Greetings(){}
}
