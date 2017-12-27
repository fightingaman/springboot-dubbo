package com.zhiwei.crisis.service.config;

import com.alibaba.dubbo.config.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zzm
 * @version V1.0
 * @Description dubbo
 * @date 2017-12-11 14:44
 **/
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "dubbo")
public class DubboConfig {
    private ApplicationConfig application;
    private RegistryConfig registry;
    private ProtocolConfig protocol;
    private ProviderConfig provider;

    @Bean
    public ApplicationConfig applicationConfig() {
        if (application == null) {
            application = new ApplicationConfig();
        }
        return application;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        if(protocol == null){
            protocol = new ProtocolConfig();
        }
        return protocol;
    }

    @Bean
    public RegistryConfig registryConfig() {
        if (registry == null) {
            registry = new RegistryConfig();
        }
        return registry;
    }
    @Bean
    public ProviderConfig providerConfig(){
        if(provider == null){
            provider = new ProviderConfig();
        }
        return provider;
    }
}
