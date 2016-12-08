package com.example.dao;

import com.example.models.SFMovies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 上午9:40
 */
public interface MoviesDao extends JpaSpecificationExecutor<SFMovies>,JpaRepository<SFMovies, Long> {
    List<SFMovies> findByTitleLike(String title);
}
