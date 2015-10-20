package org.cdac.gist.web.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;

/**
 * Created by kamalp on 12-06-2015.
 */

@ConfigurationProperties(prefix = "service", ignoreUnknownFields = true)
public class ServiceVersionProperties {
    Logger logger = LoggerFactory.getLogger(getClass());

    String version = "@pomversion@";

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ServiceVersionProperties{" +
                "version='" + version + '\'' +
                '}';
    }

    @PostConstruct
    public void log() {
        if (logger.isDebugEnabled())
            logger.debug("Configured {},  {}", getClass(), toString());
        else if (logger.isInfoEnabled())
            logger.info("Configured {}", getClass());
    }
}
