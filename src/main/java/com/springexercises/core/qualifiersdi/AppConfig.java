package com.springexercises.core.qualifiersdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean({"myBean1", "student"})
    public Person person1() {
        return new Person(1, "Student");
    }

    @Bean({"myBean2", "teacher"})
    public Person person2() {
        return new Person(1, "Teacher");
    }

    @Bean({"myBean3", "dean"})
    public Person person3() {
        return new Person(1, "Dean");
    }
}
