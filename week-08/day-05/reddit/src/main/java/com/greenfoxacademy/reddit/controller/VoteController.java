package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PostServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VoteController {
    private PostServiceImpl postService;

    public VoteController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("/{id}/upvote")
    public String upVotePost(@PathVariable long id) {
        Post post = postService.findById(id);
        post.setScore(post.getScore() + 1);
        postService.save(post);
        return "redirect:/";
    }

    @GetMapping("/{id}/downvote")
    public String downVotePost(@PathVariable long id) {
        Post post = postService.findById(id);
        post.setScore(post.getScore() - 1);
        postService.save(post);
        return "redirect:/";
    }

}
