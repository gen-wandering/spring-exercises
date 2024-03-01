package com.springexercises.partb.questions.aliasconflict;

import com.springexercises.partb.questions.aliasconflict.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AliasConflictMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(appContext.getBean("student"));
        System.out.println(appContext.getBean("worker"));
    }
}
