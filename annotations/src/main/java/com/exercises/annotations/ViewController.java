package com.exercises.annotations;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {
    public final String indexPath = "index.html";
    public final String aboutPath = "about.html";
    public final String contentPath = "content.html";

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(indexPath);
        modelAndView.setStatus(HttpStatus.OK);
        return modelAndView;
    }

    @RequestMapping("/about")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(aboutPath);
        modelAndView.setStatus(HttpStatus.OK);
        return modelAndView;
    }

    @RequestMapping("/content")
    public ModelAndView content() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(contentPath);
        modelAndView.setStatus(HttpStatus.OK);
        return modelAndView;
    }
}
