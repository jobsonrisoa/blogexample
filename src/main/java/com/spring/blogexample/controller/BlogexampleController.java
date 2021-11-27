package com.spring.blogexample.controller;

import com.spring.blogexample.model.Post;
import com.spring.blogexample.service.BlogexampleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogexampleController {

    BlogexampleService blogexampleService;

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = blogexampleService.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

}
