package com.spring.blogexample.service.serviceImpl;

import com.spring.blogexample.model.Post;
import com.spring.blogexample.repository.BlogexampleRepository;
import com.spring.blogexample.service.BlogexampleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogexampleServiceImpl implements BlogexampleService {

    @Autowired
    BlogexampleRepository blogexampleRepository;

    @Override
    public List<Post> findAll() {
        return blogexampleRepository.findAll();
    }

    @Override
    public Post findByID(long id) {
        return blogexampleRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogexampleRepository.save(post);
    }
}
