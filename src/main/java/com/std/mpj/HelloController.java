package com.std.mpj;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}