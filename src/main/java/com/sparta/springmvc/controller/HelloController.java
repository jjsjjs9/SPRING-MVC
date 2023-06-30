package com.sparta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";

    }

    @GetMapping("/api/get")
    @ResponseBody
    public String get(){
        return "get metho. dycjd";
    }

    @PostMapping("/api/post")
    @ResponseBody

    public String post(){
        return "post method";
    }
}