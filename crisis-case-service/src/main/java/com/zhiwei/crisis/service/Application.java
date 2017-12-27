package com.zhiwei.crisis.service;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.Semaphore;

/**
 * @author zzm
 * @version V1.0
 * @Description 服务提供
 * @date 2017-12-11 10:44
 **/
@SpringBootApplication
@DubboComponentScan("com.zhiwei.crisis.service.service.impl")
public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
        logger.info("服务者启动成功!");
        new Semaphore(0).acquire();
    }
}
