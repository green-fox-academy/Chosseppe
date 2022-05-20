package com.greenfoxaccademy.reddit.controllers;

import com.greenfoxaccademy.reddit.models.Post;
import com.greenfoxaccademy.reddit.repositories.PostRepository;
import com.greenfoxaccademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.net.URL;

@Controller
public class SubmittingController {

    private PostService postService;
    private PostRepository postRepository;

    @Autowired
    public SubmittingController(PostService postService, PostRepository postRepository){
        this.postService = postService;
        this.postRepository = postRepository;
    }

    @PostMapping("/submit/add")
    public String submitNewPost(Model model, @ModelAttribute("title") String title, @ModelAttribute("url") URL url){
        postRepository.save(new Post(title, url));
        model.addAttribute("Posts", postService.findAll());
        return "redirect:/";
    }
}
