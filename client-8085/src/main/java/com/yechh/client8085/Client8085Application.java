package com.yechh.client8085;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class Client8085Application {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @GetMapping("/test8085")
    public String home(){
        return "Hello World! 姓名："+name+"年龄："+age;
    }
    public static void main(String[] args) {
        SpringApplication.run(Client8085Application.class, args);
    }

}

