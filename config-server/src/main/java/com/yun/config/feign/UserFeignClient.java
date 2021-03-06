package com.yun.config.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "admin-server", path = "/configFeign")
public interface UserFeignClient {

    @RequestMapping(value = "/findStr", method = RequestMethod.GET)
    public String findStr(@RequestParam("str")String str);
}
