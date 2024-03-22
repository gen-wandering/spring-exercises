package com.springexercises.core.aliasredefinition.config;

import com.springexercises.core.aliasredefinition.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean({"person", "student"})
    public Student getStudent() {
        return new Student(22, "StudentName", 20);
    }
}
