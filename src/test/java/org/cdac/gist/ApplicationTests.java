package org.cdac.gist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.lang.annotation.*;


/**
 * Developer       :  Rohit Gupta
 * File created on :  12-06-2015 at 05:44.
 * Description : This is simple Boot Application Runner Test Class aims to test context loads properly on a random port
 */

@RunWith(value = SpringJUnit4ClassRunner.class)
@SpringBootTests
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }

}

