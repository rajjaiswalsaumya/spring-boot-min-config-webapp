package org.cdac.gist;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Developer       :  Rohit Gupta
 * File created on :  12-06-2015 at 00:23.
 * Description : Simple Spring Boot Servlet Initializer used for creating war context
 */

public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}

