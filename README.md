# spring-boot-min-config-webapp

This project simulates simple springboot project and configurs the minimum requirement that every spring boot 
project should have. Configured Spring Security in order to secure application with csrf attacks. Added some custom 
headers to unreveal some of valuable information. Connection to server is dropped after 5s set into response header.

A util ServiceVersion class is created, which is used to monitor the actual version of deployment. <strike>Current release donot
take that up by reflection, but it requires the property to be set into yaml file with the name service.version
which is mapped by-default by boot using @ConfigurationProperties. The task to update the version will be tedious for now
as we have to maintain it in pom as well as in properties file. But the support of Reflection is guaranteed and 
I will implement soon.</strike>

Now no need to map service.version in yaml. It will be by default mapped to your artifact version in yaml. Gr8 right!
Thanks to maven tasks.

SpringBoot is best way of booting your app with Spring. No problem whatsoever of jar version and compatibility maintenance.
All comes out of the box done by some genius developers (say Dave Syer, Phill Webb, Josh Long and many many more...)

Your may pull this application and start booting into spring-boot app. The minimum things are done for you.

The yaml(yml) is new way of defining properties into Application Context. 
<b>Note:</b> yaml requires four spaces in start and one space after colon for properties.

Confusing ? Ok say you wanted to define these to properties in application.properties

logging.level.org.springframework.boot=DEBUG   
logging.level.org.cdac.gist=DEBUG

In yaml syntax this will go as
<pre>logging:
    level:
        org:
            springframework:
                boot: ERROR
            cdac:
                gist: DEBUG
---
</pre>
<b>Note extra space after colon and four spaces replace each .</b>

If you dont understand yaml, go with traditional application.properties.
Replace application.yaml with application.properties and define these properties
<pre>
server.port=9090
spring.view.prefix=/views/
spring.view.suffix=.jsp
debug=true
logging.level.org.springframework.boot=DEBUG   
logging.level.org.cdac.gist=DEBUG
service.version=1.0.0.0
</pre>


