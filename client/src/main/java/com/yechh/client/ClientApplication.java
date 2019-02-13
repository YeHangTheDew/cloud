package com.yechh.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class ClientApplication {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @GetMapping("/say")
    public String home(){
        return "Hello World! 姓名："+name+"年龄："+age;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

}

