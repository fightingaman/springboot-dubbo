package com.zhiwei.crisis.service.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhiwei.crisis.service.service.api.HelloService;

/**
 * @author
 * @version V1.0
 * @Description
 * @date 2017-12-11 10:47
 **/
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String say() {
        return "lalala";
    }
}
