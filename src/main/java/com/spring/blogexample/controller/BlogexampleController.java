package com.spring.blogexample.controller;

import com.spring.blogexample.model.Post;
import com.spring.blogexample.service.BlogexampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogexampleController {

    @Autowired
    BlogexampleService blogexampleService;

    @GetMapping("/post")
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("post");
        List<Post> posts = blogexampleService.findAll();
        mv.addObject("post", posts);
        return mv;
    }

}
