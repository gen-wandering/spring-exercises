package com.springexercises.conditionalbeanconfig;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class EnvironmentCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = context.getEnvironment();

        String profile = environment.getProperty("spring.profiles.active");
        boolean isProduction = "production".equals(profile);

        String osName = environment.getProperty("os.name");
        boolean isWindows = osName.contains("Windows");

        return isProduction && isWindows;
    }
}