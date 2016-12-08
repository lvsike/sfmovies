package com.example.service;

import com.example.models.SFMovies;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 下午3:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviesServiceTest {
    @Autowired
    private MoviesService moviesService;

    @Test
    public void testMoviesQueryByNull() throws Exception {
        List<SFMovies> sfMoviesList = moviesService.findMoives(null);
        Assert.assertTrue(sfMoviesList.size() == 0);
    }

    @Test
    public void testMoviesQueryByEmptyObject() throws Exception{
        SFMovies sfMovies = new SFMovies();
        List<SFMovies> sfMoviesList = moviesService.findMoives(sfMovies);
        Assert.assertTrue(sfMoviesList.size() > 0);
    }

    @Test
    public void testMoviesQueryByNormalObject() throws Exception{
        SFMovies sfMovies = new SFMovies();
        sfMovies.setActor1("sidd");
        List<SFMovies> sfMoviesList = moviesService.findMoives(sfMovies);
        Assert.assertTrue(sfMoviesList.size() > 0);
    }
}
