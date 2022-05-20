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
    public List<Post> findAll(){return (List<Post>) postRepository.findAll();}

    @Override
    public Post searchById(Long id) {return
        postRepository.getById(id);
    }

    @Override
    public List<Post> savePost(Post post) {
        return (List<Post>) postRepository.save(post);
    }


}
