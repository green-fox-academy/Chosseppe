package com.greenfoxaccademy.reddit.services;

import com.greenfoxaccademy.reddit.models.User;
import com.greenfoxaccademy.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public void save(User user){
        userRepository.save(user);
    }
}
