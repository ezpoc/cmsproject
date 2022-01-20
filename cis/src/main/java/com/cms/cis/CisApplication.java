package com.cms.cis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class CisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CisApplication.class, args);
    }

}
