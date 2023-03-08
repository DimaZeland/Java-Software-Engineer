package com.demo.springblog.repository;

import com.demo.springblog.domain.Post;

import java.util.Set;

public interface PostRepository {
    void addPost(Post post);

    Set<Post> findAllPosts();
}
