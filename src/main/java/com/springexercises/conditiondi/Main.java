package com.springexercises.conditiondi;

import com.springexercises.model.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserRepository userRepository = context.getBean(UserRepository.class);
        userRepository.performDatabaseOperation(); // Output depends on the condition

        context.close();
    }
}
