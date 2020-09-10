package com.example.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* 这里是首页 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}
