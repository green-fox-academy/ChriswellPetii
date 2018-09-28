package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void createPost(String content, String url) {
        Post checkPost = postRepository.findByContent(content);
        Post checkPost2 = postRepository.findByUrl(url);
        if (checkPost == null && checkPost2 == null) {
            Post post = new Post(content, url);
            postRepository.save(post);
        }
        return;
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @Override
    public Post findById(long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public void upVote(long id) {
        Post post = postRepository.findById(id).get();
        post.setScore(post.getScore() + 1);
        postRepository.save(post);

    }

    @Override
    public void downVote(long id) {
        Post post = postRepository.findById(id).get();
        post.setScore(post.getScore() - 1);
        postRepository.save(post);
    }
}
