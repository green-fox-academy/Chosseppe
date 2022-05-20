package com.greenfoxaccademy.reddit.controllers;

import com.greenfoxaccademy.reddit.repositories.PostRepository;
import com.greenfoxaccademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private PostService postService;

    @Autowired
    public IndexController(PostService postService){
        this.postService = postService;
    }

    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute("Posts", postService.findAll());
        return "index";
    }

    @GetMapping("/submit")
    public String Submitting(){ return "submitting-new-post";}

    @GetMapping("/{id}/positive")
    public String addPositivePoint(@PathVariable Long id, Model model){
        postService.savePost(postService.searchById(id).setPositive(postService.searchById(id).getPositive() + 1));
        model.addAttribute("Posts", postService.findAll());
        return "redirect:/";
    }
}
