package com.spring.blogexample.utils;

import com.spring.blogexample.model.Post;
import com.spring.blogexample.repository.BlogexampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DummyData {

    @Autowired
    BlogexampleRepository blogexampleRepository;

    @PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();

        Post post1 = new Post();
        post1.setAutor("Jobson Ribeiro");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Texto exemplo 1");

        Post post2 = new Post();
        post2.setAutor("Jobson Ribeiro 2");
        post2.setData(LocalDate.now());
        post2.setTitulo("Docker 2");
        post2.setTexto("Texto exemplo 2");

        Post post3 = new Post();
        post3.setAutor("Jobson Ribeiro 3");
        post3.setData(LocalDate.now());
        post3.setTitulo("Docker 3");
        post3.setTexto("Texto exemplo 3");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList) {
            Post postSaved = blogexampleRepository.save(post);
            System.out.println(postSaved.getId());
        }



    }

}
