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
    public void testMoviesQueryByEmptyObject() throws Exception {
        SFMovies sfMovies = new SFMovies();
        List<SFMovies> sfMoviesList = moviesService.findMoives(sfMovies);
        Assert.assertTrue(sfMoviesList.size() > 0);
    }

    @Test
    public void testMoviesQueryBySpecialCharacter() throws Exception {
        SFMovies sfMovies = new SFMovies();
        sfMovies.setTitle("!@#$%^&*()'");
        sfMovies.setFunFacts("!@#$%^&*()'");
        sfMovies.setProductionCompany("!@#$%^&*()'");
        sfMovies.setDistributor("!@#$%^&*()'");
        sfMovies.setReleaseYear("!@#$%^&*()'");
        sfMovies.setDirector("!@#$%^&*()'");
        sfMovies.setWriter("!@#$%^&*()'");
        sfMovies.setActor1("!@#$%^&*()'");
        sfMovies.setActor2("!@#$%^&*()'");
        sfMovies.setActor3("!@#$%^&*()'");
        List<SFMovies> sfMoviesList = moviesService.findMoives(sfMovies);
        Assert.assertTrue(sfMoviesList.size() == 0);
    }

    @Test
    public void testMoviesQueryByNormalObject() throws Exception {
        SFMovies sfMovies = new SFMovies();
        sfMovies.setTitle("Smile");
        sfMovies.setReleaseYear("1997");
        sfMovies.setLocations("1100 California Street");
        sfMovies.setFunFacts("Grace");
        sfMovies.setProductionCompany("Paramount");
        sfMovies.setDistributor("Paramount");
        sfMovies.setDirector("Keith");
        sfMovies.setWriter("Keith Samples & Kevin Meyer");
        sfMovies.setActor1("Greg");
        sfMovies.setActor2("Lauren");
        sfMovies.setActor3("");
        List<SFMovies> sfMoviesList = moviesService.findMoives(sfMovies);
        Assert.assertTrue(sfMoviesList.size() > 0);
    }
}
