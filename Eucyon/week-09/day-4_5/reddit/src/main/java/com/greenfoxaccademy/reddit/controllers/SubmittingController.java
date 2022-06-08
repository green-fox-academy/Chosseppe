package com.greenfoxaccademy.reddit.controllers;

import com.greenfoxaccademy.reddit.models.Post;
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

    @Autowired
    public SubmittingController(PostService postService){
        this.postService = postService;
    }

    @PostMapping("/submit/add")
    public String submitNewPost(Model model, @ModelAttribute("title") String title, @ModelAttribute("url") URL url){
        postService.save(new Post(title, url));
        return "redirect:/";
    }
}
