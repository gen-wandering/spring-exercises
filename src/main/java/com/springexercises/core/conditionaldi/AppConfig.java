package com.springexercises.core.conditionaldi;

import com.springexercises.core.model.Database;
import com.springexercises.core.model.MockDatabase;
import com.springexercises.core.model.MySQLDatabase;
import com.springexercises.core.model.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
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