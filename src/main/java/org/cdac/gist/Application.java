package org.cdac.gist;

import org.cdac.gist.web.configs.ServiceVersionProperties;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import static org.springframework.boot.SpringApplication.run;

/**
 * Developer       :  Rohit Gupta
 * File created on :  12-06-2015 at 00:17.
 * Description : This is simple Boot Application Runner Class
 */

@SpringBootApplication
@EnableConfigurationProperties(ServiceVersionProperties.class)
public class Application {
    public static void main(String[] args) {
        run(org.cdac.gist.Application.class, args);
    }
}

