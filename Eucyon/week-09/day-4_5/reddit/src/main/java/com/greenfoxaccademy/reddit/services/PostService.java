package com.greenfoxaccademy.reddit.services;

import com.greenfoxaccademy.reddit.models.Post;

import java.util.List;

public interface PostService {



    List<Post> findAll();

   void voteUp(Long id);

    void voteDown(Long id);

}
