package com.springexercises.core.conditionaldi;

import com.springexercises.core.model.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("production");
        // context.getEnvironment().setActiveProfiles("test");
        context.register(AppConfig.class);
        context.refresh();

        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.performDatabaseOperation(); // Output depends on the condition

        context.close();
    }
}