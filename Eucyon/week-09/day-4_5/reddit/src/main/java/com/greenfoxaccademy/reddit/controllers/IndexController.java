package com.greenfoxaccademy.reddit.controllers;

import com.greenfoxaccademy.reddit.models.User;
import com.greenfoxaccademy.reddit.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@Controller
public class IndexController {

    private PostService postService;

    @Autowired
    public IndexController(PostService postService){
        this.postService = postService;
    }

    @GetMapping (value = "/")
    public String manipulateIndex(Model model,
                        @RequestParam(required = false, defaultValue = "0") Integer pageNo){
        model.addAttribute("pageNo", pageNo );
        int PAGE_SIZE = 10;
        model.addAttribute("posts",
                postService.findAll( PageRequest.of(pageNo, PAGE_SIZE, Sort.by("rankingNumber").descending())));
        return "index";
    }

    @GetMapping("/login")
    public String userLogin(){ return "logging";}

    @GetMapping("/submit")
    public String postSubmitting(){ return "submitting-new-post";}


    @GetMapping("/{id}/positive")
    public String addPositivePoint(@PathVariable Long id){
        postService.voteUp(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/negative")
    public String addNegativePoint(@PathVariable Long id){
        postService.voteDown(id);
        return "redirect:/";
    }
}
