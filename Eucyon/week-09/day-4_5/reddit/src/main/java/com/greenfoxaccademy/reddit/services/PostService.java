package com.greenfoxaccademy.reddit.services;

import com.greenfoxaccademy.reddit.models.Post;

import java.util.List;

public interface PostService {



    List<Post> findAll();

   Post searchById(Long id);

   List<Post> savePost(Post post);

}
