package com.yechh.cloudclient.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    public String hello(@RequestParam String name) {
        System.out.println("cloudclient start");
        return name + "===端口：8002被调用了===";
    }

}
