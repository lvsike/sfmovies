package com.example.controller;

import com.example.models.SFMovies;
import com.example.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 上午6:23
 */
@Controller
public class MoviesControler {
    @Autowired
    MoviesService moviesService;

    @RequestMapping(value = "displayMoviesList")
    public String moviesList(SFMovies sfMovies, Model model) {
        model.addAttribute("moviesList", this.moviesService.findMoives(sfMovies));
        return "home";
    }
}
