package com.greenfox.exams.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Viktor on 2017.01.11..
 */

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackRepository repository;

    @RequestMapping("/welcome")
    public String



}
