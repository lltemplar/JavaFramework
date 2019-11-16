package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWorldController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello,World!";
    }

    @RequestMapping(path="/index",method = RequestMethod.GET)
    public String index(Map map){
        map.put("message", "这是测试的内容。。。");
        map.put("toUserName", "张三");
        map.put("fromUserName", "李四");
        return "index";
    }
}
