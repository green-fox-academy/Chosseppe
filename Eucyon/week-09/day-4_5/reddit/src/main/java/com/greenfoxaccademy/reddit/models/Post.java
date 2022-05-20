package com.greenfoxaccademy.reddit.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;

@Getter
@Setter
@Entity(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private URL url;
    private int positive;
    private int negative;

    public Post(String title, URL url){
        this.title = title;
        this.url = url;
        this.positive = 0;
        this.negative = 0;
    }

    public Post(){}
}
