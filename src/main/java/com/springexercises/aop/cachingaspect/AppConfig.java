package com.springexercises.aop.cachingaspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Person person() {
        return new Person(1,
                34,
                "PersonName",
                "PersonSurname"
        );
    }

    @Bean
    public CachingAspect cachingAspect() {
        return new CachingAspect();
    }

    @Bean
    public ProxyInterestingPointsAspect proxyInterestingPointsAspect() {
        return new ProxyInterestingPointsAspect();
    }
}