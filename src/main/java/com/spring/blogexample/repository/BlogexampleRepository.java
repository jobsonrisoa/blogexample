package com.spring.blogexample.repository;

import com.spring.blogexample.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogexampleRepository extends JpaRepository<Post, Long> {

}
