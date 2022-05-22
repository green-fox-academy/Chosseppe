package com.greenfoxaccademy.reddit.services;

import com.greenfoxaccademy.reddit.models.Post;
import com.greenfoxaccademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository){this.postRepository = postRepository;}

    @Override
    public List<Post> findAll(){return postRepository.findAll();}

    @Override
    public void voteUp(Long id) {
        Post outPost = postRepository.getById(id);
        outPost.setPositive(outPost.getPositive() + 1);
        postRepository.save(outPost);
    }

    @Override
    public void voteDown(Long id) {
        Post outPost = postRepository.getById(id);
        outPost.setPositive(outPost.getPositive() - 1);
        postRepository.save(outPost);
    }


}
