package com.yun.config.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/configFeign")
@RestController
public class FeignController {

    @RequestMapping(value = "/findStr", method = RequestMethod.GET)
    public String findStr(@RequestParam("str")String str){
        String ss =  str + Math.random();
        log.info("这里是被调用类：FeignController*****findStr/{}", ss);
        return ss;
    }
}
