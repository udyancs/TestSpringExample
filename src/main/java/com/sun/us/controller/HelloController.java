package com.sun.us.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by udyan.shardhar on 4/2/17.
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String viewHome(){
        return "hello";
    }

    @RequestMapping("/welcome")
    public ModelAndView helloHome(){
        final ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("message", "This is message for Udyan");
        return modelAndView;
    }
}
