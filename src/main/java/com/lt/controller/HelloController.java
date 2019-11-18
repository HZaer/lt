package com.lt.controller;

import com.lt.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    String hello(Hello hello) {
        return "Hello World!";
    }

    @RequestMapping("index")
    String index() {
        return "static/index.html";
    }

}