package com.zhiwei.crisis.admin.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzm
 * @version V1.0
 * @Description dubbo 配置类
 * @date 2017-12-11 17:25
 **/
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "dubbo")
public class DubboConfig {
    private ApplicationConfig application;
    private ConsumerConfig consumer;
    private RegistryConfig registry;

    @Bean
    public ApplicationConfig applicationConfig() {
        if (application == null) {
            application = new ApplicationConfig();
        }
        return application;
    }

    @Bean
    public ConsumerConfig consumerConfig() {
        if (consumer == null) {
            consumer = new ConsumerConfig();
        }
        return consumer;
    }

    @Bean
    public RegistryConfig registryConfig() {
        if (registry == null) {
            registry = new RegistryConfig();
        }
        return registry;
    }
}
