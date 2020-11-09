package com.yun.admin.controller;

import com.yun.config.feign.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/firstController")
@Slf4j
public class DemoController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/hi")
    public String hello(){
        return "hello world";
    }

    @GetMapping("feign")
    public String configFeign(){
        String str = userFeignClient.findStr("123");
        log.info("得到的结果*****{}",str);
        return str;
    }
}
