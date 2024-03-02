package com.springexercises.partb.validationaspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public ValidationAspect validationAspect() {
        return new ValidationAspect();
    }

    @Bean
    public Service service() {
        return new Service(0, "default");
    }
}
