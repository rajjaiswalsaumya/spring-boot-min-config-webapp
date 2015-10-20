package org.cdac.gist;

import org.joda.time.MutableDateTime;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.security.web.header.writers.frameoptions.XFrameOptionsHeaderWriter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Developer       :  Rohit Gupta
 * File created on :  12-06-2015 at 07:38.
 * Description : Used to customise the pre configured beans
 */

@Configuration
public class EmbeddedBeansCustomizer {

    @Configuration
    static class ExtendedWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            MutableDateTime mutableDateTime = new MutableDateTime(new Date());
            mutableDateTime.addDays(3);
            http
                    .headers()
                    .httpStrictTransportSecurity()
                    .xssProtection()
                    .addHeaderWriter(new StaticHeadersWriter("Server", "Secured App Servers"))
                    .addHeaderWriter(new StaticHeadersWriter("Expires", mutableDateTime.toString()))
                    .addHeaderWriter(new StaticHeadersWriter("Cache-Control", "no-cache,no-store,must-revalidate"))
                    .addHeaderWriter(new StaticHeadersWriter("Access-Control-Allow-Methods", "POST, PUT, GET, DELETE, OPTIONS"))
                    .addHeaderWriter(new StaticHeadersWriter("Keep-Alive", "5000"))
                    .addHeaderWriter(new StaticHeadersWriter("Pragma", "no-cache"))
                    .addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN));
        }
    }

    @Configuration
    static class ExtendedWebMvcConfiguration extends WebMvcConfigurerAdapter {
        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addRedirectViewController("/", "/index");
        }

//        @Override
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            registry
//                    .addResourceHandler("/css/**")
//                    .addResourceLocations("/resources/static/css/**")
//                    .setCachePeriod(31556926);
//            registry
//                    .addResourceHandler("/js/**")
//                    .addResourceLocations("/resources/static/js/** ")
//                    .setCachePeriod(31556926);
//        }
    }


}
