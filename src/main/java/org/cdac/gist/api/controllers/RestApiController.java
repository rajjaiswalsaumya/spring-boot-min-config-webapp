package org.cdac.gist.api.controllers;

import org.cdac.gist.domain.bo.ServiceVersion;
import org.cdac.gist.web.configs.ServiceVersionProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kamalp on 27-01-2015.
 */

@RestController
public class RestApiController {

    @Autowired
    ServiceVersionProperties serviceVersionProperties;

    @RequestMapping(value = "/api/rest", method = RequestMethod.GET)
    public ServiceVersion api() {
        return new ServiceVersion(serviceVersionProperties.getVersion());
    }
}
