package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    private PostServiceImpl postService;

    public MainController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String openMainPage(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "main";
    }
}
