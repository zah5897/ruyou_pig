package com.ruyou.pig.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@Configurable
@ComponentScan(basePackages = {"com.ruyou.pig.test"})
public class RuyouPigApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(RuyouPigApplication.class);
    }

    public static void main(java.lang.String[] args) {
        SpringApplication.run(RuyouPigApplication.class, args);
    }
}
