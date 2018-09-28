package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VoteController {
    private PostService postService;

    public VoteController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}/upvote")
    public String upVotePost(@PathVariable long id) {
        postService.upVote(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/downvote")
    public String downVotePost(@PathVariable long id) {
        postService.downVote(id);
        return "redirect:/";
    }

}
