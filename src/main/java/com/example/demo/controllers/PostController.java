package com.example.demo.controllers;

import com.example.demo.Domain.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Henrik on 2017-11-03.
 */
@Controller
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String listPosts(Model model){
        model.addAttribute("posts", postRepository.findAll());
        return "/posts/list";
    }
}
