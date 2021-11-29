package com.spring.blogexample.service;

import com.spring.blogexample.model.Post;

import java.util.List;

public interface BlogexampleService {

    List<Post> findAll();
    Post findById(long id);
    Post save(Post post);


}
