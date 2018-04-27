package com.jojoldu.aws.beanstalk.internal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class InternalApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternalApiApplication.class, args);
    }

    @GetMapping("/")
    public String index () {
        return "Hello External API";
    }
}
