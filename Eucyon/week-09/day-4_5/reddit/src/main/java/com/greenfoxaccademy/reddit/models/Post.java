package com.greenfoxaccademy.reddit.models;

import lombok.*;

import javax.persistence.*;
import java.net.URL;
import java.util.Date;

@Getter
@Setter
@Entity(name = "Post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private URL url;
    private int rankingNumber;
    @Temporal(TemporalType.DATE)
    private Date dateOfCreate = new Date(System.currentTimeMillis());

    public Post(String title, URL url){
        this.title = title;
        this.url = url;
        this.rankingNumber = 0;
    }

    public Post(){}
}
