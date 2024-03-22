package com.springexercises.aop.cachingaspect.proxywithinterface;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public ServiceAspect serviceAspect() {
        return new ServiceAspect();
    }

    @Bean
    public Service service() {
        return new ServiceImpl();
    }
}
