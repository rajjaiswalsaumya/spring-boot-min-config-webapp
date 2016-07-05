package org.cdac.gist.api.controllers;

import org.cdac.gist.domain.bo.ServiceVersion;
import org.cdac.gist.web.configs.ServiceVersionProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.test.util.AssertionErrors.assertEquals;

/**
 * Created by Sam on 7/6/2016.
 */

@RunWith(value = SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestApiControllerTest {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    ServiceVersionProperties serviceVersionProperties;

    @Test
    public void testRest() throws Exception {
        String url = "/api/rest";
        ServiceVersion serviceVersion = testRestTemplate.getForEntity(url, ServiceVersion.class).getBody();
        assertEquals("Are equal ?", serviceVersionProperties.getVersion(), serviceVersion.getVersion());
    }
}
