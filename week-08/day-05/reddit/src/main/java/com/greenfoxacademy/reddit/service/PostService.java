package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;

public interface PostService {
    void createPost(String content, String url);

    void save(Post post);

    Iterable<Post> findAll();

    Post findById(long id);
}
