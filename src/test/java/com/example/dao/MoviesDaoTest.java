package com.example.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 下午4:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviesDaoTest {
    @Autowired
    private MoviesDao moviesDao;

    @Test
    public void testFindByTitleLike() {
        Assert.assertTrue(this.moviesDao.findByTitleLike("%a%").size() > 0);
    }
}
