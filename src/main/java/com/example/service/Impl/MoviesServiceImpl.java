package com.example.service.Impl;

import com.example.dao.MoviesDao;
import com.example.models.SFMovies;
import com.example.service.MoviesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 上午9:51
 */
@Component
public class MoviesServiceImpl implements MoviesService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MoviesServiceImpl.class);
    @Autowired
    private MoviesDao moviesDao;

    @Override
    public List<SFMovies> findMoives(SFMovies sfMovies) {
        try {
            if (sfMovies != null) {
                return this.moviesDao.findAll((root, criteriaQuery, criteriaBuilder) -> {
                    List<Predicate> predicateList = new ArrayList<>();
                    if (sfMovies.getTitle() != null && sfMovies.getTitle().trim().length() > 0) {
                        Path<String> namePath = root.get("title");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getTitle())));
                    }
                    if (sfMovies.getReleaseYear() != null && sfMovies.getReleaseYear().trim().length() > 0) {
                        Path<String> namePath = root.get("releaseYear");
                        predicateList.add(criteriaBuilder.equal(namePath, sfMovies.getReleaseYear()));
                    }
                    if (sfMovies.getLocations() != null && sfMovies.getLocations().trim().length() > 0) {
                        Path<String> namePath = root.get("locations");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getLocations())));
                    }
                    if (sfMovies.getFunFacts() != null && sfMovies.getFunFacts().trim().length() > 0) {
                        Path<String> namePath = root.get("funFacts");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getFunFacts())));
                    }
                    if (sfMovies.getProductionCompany() != null && sfMovies.getProductionCompany().trim().length() > 0) {
                        Path<String> namePath = root.get("productionCompany");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getProductionCompany())));
                    }
                    if (sfMovies.getDistributor() != null && sfMovies.getDistributor().trim().length() > 0) {
                        Path<String> namePath = root.get("distributor");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getDistributor())));
                    }
                    if (sfMovies.getDirector() != null && sfMovies.getDirector().trim().length() > 0) {
                        Path<String> namePath = root.get("director");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getDirector())));
                    }
                    if (sfMovies.getActor1() != null && sfMovies.getActor1().trim().length() > 0) {
                        Path<String> namePath = root.get("actor1");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getActor1())));
                    }
                    if (sfMovies.getActor2() != null && sfMovies.getActor2().trim().length() > 0) {
                        Path<String> namePath = root.get("actor2");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getActor2())));
                    }
                    if (sfMovies.getActor3() != null && sfMovies.getActor3().trim().length() > 0) {
                        Path<String> namePath = root.get("actor3");
                        predicateList.add(criteriaBuilder.like(namePath, String.format("%%%s%%", sfMovies.getActor3())));
                    }
                    criteriaQuery.where(predicateList.toArray(new Predicate[predicateList.size()]));
                    return null;
                });
            }
        } catch (Exception e) {
            LOGGER.error("MoviesServiceImpl findMoives exception:", e);
        }
        return Collections.emptyList();
    }
}
