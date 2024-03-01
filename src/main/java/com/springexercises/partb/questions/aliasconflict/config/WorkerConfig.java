package com.springexercises.partb.questions.aliasconflict.config;

import com.springexercises.partb.questions.aliasconflict.model.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WorkerConfig {

    @Bean({"person", "worker"})
    public Worker getWorker() {
        return new Worker(32, "WorkerName", 70);
    }
}
