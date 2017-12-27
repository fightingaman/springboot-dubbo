package com.zhiwei.crisis.app;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zzm
 * @version V1.0
 * @Description 消费者
 * @date 2017-12-11 10:24
 **/
@SpringBootApplication
@DubboComponentScan("com.zhiwei.crisis.service.service.api")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
