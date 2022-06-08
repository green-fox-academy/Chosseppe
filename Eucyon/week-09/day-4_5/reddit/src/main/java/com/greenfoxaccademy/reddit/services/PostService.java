package com.greenfoxaccademy.reddit.services;

import com.greenfoxaccademy.reddit.models.Post;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface PostService {

    Page<Post> findAll(Pageable pageable);

    void voteUp(Long id);

    void voteDown(Long id);

    void save(Post post);

}
