package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Author: <a href="mailto:lsk2008@msn.com">sike,lv</a>
 * Date: 16-12-8 下午4:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MovieControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testDisplayMoviesList() throws Exception {
        this.mvc.perform(MockMvcRequestBuilders.get("/displayMoviesList?actor1=sidd")).andExpect(status().isOk()).andExpect(content().string(containsString("Sidd")));
    }

    @Test
    public void testGoHomePage() throws Exception{
        this.mvc.perform(MockMvcRequestBuilders.get("/")).andExpect(status().isOk());
    }
}
