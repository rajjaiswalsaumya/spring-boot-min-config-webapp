package org.cdac.gist;

import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import java.lang.annotation.*;

/**
 * Created by kamalp on 12-06-2015.
 */


@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest(value = {"server.port:7766"})
public @interface SpringBootTests {
}
