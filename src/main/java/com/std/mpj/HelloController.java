package com.std.mpj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@RestController
public class HelloController {

    // 获取.yml 文件中值
//    @Value("${name}")
//    private String name;
//
//    // 获取 age
//    @Value("${test}")
//    private String url;

    @Autowired
    private author author;

    @RequestMapping("/hello")
    public String hello() {
            return "name:" + author.getName() + " url:"+ author.getUrl();
        }
    }
