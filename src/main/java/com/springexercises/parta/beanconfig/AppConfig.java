package com.springexercises.parta.beanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MessageService messageService() {
        var messageService = new MessageService();
        messageService.setMessage("Message from AppConfig.java configuration file");
        return messageService;
    }
}