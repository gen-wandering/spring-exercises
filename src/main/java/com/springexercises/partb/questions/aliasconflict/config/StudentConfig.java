package com.springexercises.partb.questions.aliasconflict.config;

import com.springexercises.partb.questions.aliasconflict.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean({"person", "student"})
    public Student getStudent() {
        return new Student(22, "StudentName", 20);
    }
}
