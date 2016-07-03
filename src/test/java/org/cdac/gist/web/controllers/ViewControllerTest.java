package org.cdac.gist.web.controllers;

import org.cdac.gist.ApplicationTests;
import org.cdac.gist.domain.bo.ServiceVersion;
import org.cdac.gist.web.configs.ServiceVersionProperties;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import static org.springframework.test.util.AssertionErrors.assertEquals;

/**
 * Created by kamalp on 12-06-2015.
 */

public class ViewControllerTest extends ApplicationTests {

    @Value("${server.port}")
    int serverPort;

    @Autowired
    ServiceVersionProperties serviceVersionProperties;

    @Test
    public void testIndex() throws Exception {
        RestTemplate template = new RestTemplate();
        String url = "http://localhost:" + serverPort + "/api/rest";
        ServiceVersion serviceVersion = template.getForEntity(url, ServiceVersion.class).getBody();
        assertEquals("Are equal ?", serviceVersionProperties.getVersion(), serviceVersion.getVersion());
    }
}