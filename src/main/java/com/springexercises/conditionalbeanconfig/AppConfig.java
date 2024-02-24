package com.springexercises.conditionalbeanconfig;

import com.springexercises.model.MockDatabase;
import com.springexercises.model.MySQLDatabase;
import com.springexercises.model.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
class AppConfig {

    @Bean
    public MockDatabase mockDatabase() {
        return new MockDatabase();
    }

    @Bean
    @Conditional(EnvironmentCondition.class)
    public MySQLDatabase mySQLDatabase() {
        return new MySQLDatabase();
    }

    @Bean
    public UserRepository userRepository() {
        try {
            return new UserRepository(mySQLDatabase());
        } catch (Exception e) {
            return new UserRepository(mockDatabase());
        }
    }
}