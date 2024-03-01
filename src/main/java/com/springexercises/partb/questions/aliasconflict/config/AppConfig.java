package com.springexercises.partb.questions.aliasconflict.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({StudentConfig.class, WorkerConfig.class}) // 2 workers
//@Import({WorkerConfig.class, StudentConfig.class}) // 2 student
public class AppConfig {
}
