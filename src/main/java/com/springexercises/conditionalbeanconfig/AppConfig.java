package com.springexercises.conditionalbeanconfig;

import com.springexercises.model.Database;
import com.springexercises.model.MockDatabase;
import com.springexercises.model.MySQLDatabase;
import com.springexercises.model.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @Conditional(UseMockDatabaseCondition.class)
    public Database mockDatabase() {
        return new MockDatabase();
    }

    @Bean
    @Conditional(UseRealDatabaseCondition.class)
    public Database mySQLDatabase() {
        return new MySQLDatabase();
    }

    @Bean
    public UserRepository userRepository(Database database) {
        return new UserRepository(database);
    }
}