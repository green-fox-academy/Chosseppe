package com.greenfoxaccademy.reddit.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column(nullable = false)
    private String userPassword;

    public User(String email, String userName, String userPassword){
        this.email = email;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public User(){}

}
