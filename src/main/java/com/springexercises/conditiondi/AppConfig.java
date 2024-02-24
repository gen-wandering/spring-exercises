package com.springexercises.conditiondi;

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
    @Conditional(UseMockDatabaseCondition.class)
    public MockDatabase mockDatabase() {
        return new MockDatabase();
    }

    @Bean
    @Conditional(UseRealDatabaseCondition.class)
    public MySQLDatabase mySQLDatabase() {
        return new MySQLDatabase();
    }

    @Bean
    public UserRepository userRepository() {
        try {
            return new UserRepository(mockDatabase());
        } catch (Exception e) {
            return new UserRepository(mySQLDatabase());
        }
    }
}