package com.zhiwei.crisis.app.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhiwei.crisis.service.service.api.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzm
 * @version V1.0
 * @Description
 * @date 2017-12-11 11:26
 **/
@RestController
public class HelloController {
    @Reference
    private HelloService helloService;

    @GetMapping("/hello")
    public Object hello() {
        return helloService.say();
    }
}
