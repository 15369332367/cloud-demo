package com.yun.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/actuator")
@RestController
public class Default {

    @GetMapping("/error")
    public String error(){
        return "这是错误页面";
    }
    @GetMapping("/info")
    public String info(){
        return "这是默认页面";
    }
}
