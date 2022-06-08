package com.greenfoxaccademy.reddit.services;

import com.greenfoxaccademy.reddit.models.Post;
import com.greenfoxaccademy.reddit.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public Page<Post> findAll(Pageable pageable) {
        return postRepository.findAll(pageable);
    }

    @Override
    public void voteUp(Long id) {
        Post outPost = postRepository.getById(id);
        outPost.setRankingNumber(outPost.getRankingNumber() + 1);
        postRepository.save(outPost);
    }

    @Override
    public void voteDown(Long id) {
        Post outPost = postRepository.getById(id);
        outPost.setRankingNumber(outPost.getRankingNumber() - 1);
        postRepository.save(outPost);
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }
}