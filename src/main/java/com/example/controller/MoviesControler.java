package com.example.controller;

import com.example.models.SFMovies;
import com.example.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 上午6:23
 */
@Controller
public class MoviesControler {
    @Autowired
    MoviesService moviesService;

    @RequestMapping(value = "/")
    public String goHomePage() {
        return "home";
    }

    @RequestMapping(value = "displayMoviesList")
    public String displayMoviesList(SFMovies sfMovies, Model model) {
        model.addAttribute("moviesList", this.moviesService.findMoives(sfMovies));
        return "home";
    }

    @RequestMapping(value = "title/{title}/locations/{locations}", method = RequestMethod.GET)
    @ResponseBody
    public List<SFMovies> getMoviesList(@PathVariable("title") String title, @PathVariable("locations") String locations) {
        SFMovies sfMovies = new SFMovies();
        sfMovies.setTitle(title);
        sfMovies.setLocations(locations);
        return this.moviesService.findMoives(sfMovies);
    }
}
