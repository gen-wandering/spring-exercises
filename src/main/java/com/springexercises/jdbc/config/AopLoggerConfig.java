package com.springexercises.jdbc.config;

import com.springexercises.jdbc.log.aop.LoggingAspect;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AopLoggerConfig {
    @Bean
    @ConditionalOnProperty(prefix = "spring.profiles", name = "active", havingValue = "dev")
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}