package org.cdac.gist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Developer       :  Rohit Gupta
 * File created on :  12-06-2015 at 05:44.
 * Description : This is simple Boot Application Runner Test Class aims to test context loads properly on a random port
 */

@RunWith(value = SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTests {

    @Test
    public void contextLoads() {
    }

}

