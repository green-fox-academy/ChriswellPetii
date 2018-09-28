package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddController {
    private PostService postService;

    public AddController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/submit")
    public String openSubmitPage() {
        return "addpost";
    }

    @PostMapping("/submit")
    public String getValuesForNewPost(String content, String url) {
        postService.createPost(content, url);
        return "redirect:/";
    }
}
