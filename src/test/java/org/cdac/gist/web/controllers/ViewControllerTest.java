package org.cdac.gist.web.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by kamalp on 12-06-2015.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(ViewController.class)
public class ViewControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testIndex() throws Exception {
        String url = "/";
        this.mvc.perform(
                get(url))
                .andExpect(redirectedUrl("/index"));
    }

    @Test
    public void testUnauthorised() throws Exception {
        String url = "/welcome";
        this.mvc.perform(
                get(url))
                .andExpect(status().ok());
    }


}
