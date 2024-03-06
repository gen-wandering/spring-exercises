package com.springexercises.partb.aliasredefinition.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({StudentConfig.class, WorkerConfig.class}) // 3 workers
@Import({WorkerConfig.class, StudentConfig.class}) // 3 students
public class AppConfig {
    /*
     * Last added bean overrides aliases in the IoC container.
     *
     * 1) @Bean({"person", "student"}) and @Bean({"person", "worker"})
     *
     *    1) @Import({StudentConfig.class, WorkerConfig.class})
     *
     *       containerInnerMap.put(Names("person", "student"), Student.class)
     *       containerInnerMap.put(Names("person", "worker"), Worker.class)
     *       // outcome:
     *       containerInnerMap.contains(Names("person", "student", "worker"), Worker.class)
     *
     *    2) @Import({WorkerConfig.class, StudentConfig.class})
     *
     *       containerInnerMap.put(Names("person", "worker"), Worker.class)
     *       containerInnerMap.put(Names("person", "student"), Student.class)
     *       // outcome:
     *       containerInnerMap.contains(Names("person", "student", "worker"), Student.class)
     *
     * 2) @Bean({"student", "person"}) and @Bean({"worker", "person"})
     *
     *    1) @Import({StudentConfig.class, WorkerConfig.class})
     *
     *       containerInnerMap.put(Names("student", "person"), Student.class)
     *       containerInnerMap.put(Names("worker", "person"), Worker.class)
     *       // outcome:
     *       containerInnerMap.contains(Names("student"), Student.class)
     *       containerInnerMap.contains(Names("person", "worker"), Worker.class)
     *
     *    2) @Import({WorkerConfig.class, StudentConfig.class})
     *
     *       containerInnerMap.put(Names("worker", "person"), Worker.class)
     *       containerInnerMap.put(Names("student", "person"), Student.class)
     *       // outcome:
     *       containerInnerMap.contains(Names("worker"), Worker.class)
     *       containerInnerMap.contains(Names("person", "student"), Student.class)
     * */
}
