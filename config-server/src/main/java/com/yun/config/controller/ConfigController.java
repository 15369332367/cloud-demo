package com.yun.config.controller;

import com.yun.config.feign.UserFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/config")
@RestController
@Slf4j
public class ConfigController {

    @GetMapping("/index")
    public String configIndex(String str){
        log.info("展示内容****{}",str);
        return str;
    }

}
