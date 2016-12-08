package com.example.service;

import com.example.models.SFMovies;

import java.util.List;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 上午9:50
 */
public interface MoviesService {
    /**
     * Queries based on the properties of the input object
     *
     * @param sfMovies
     * @return list of SFMovies
     */
    List<SFMovies> findMoives(SFMovies sfMovies);
}
