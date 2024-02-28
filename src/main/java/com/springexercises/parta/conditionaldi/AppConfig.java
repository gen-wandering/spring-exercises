package com.springexercises.parta.conditionaldi;

import com.springexercises.parta.model.Database;
import com.springexercises.parta.model.MockDatabase;
import com.springexercises.parta.model.MySQLDatabase;
import com.springexercises.parta.model.UserRepository;
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