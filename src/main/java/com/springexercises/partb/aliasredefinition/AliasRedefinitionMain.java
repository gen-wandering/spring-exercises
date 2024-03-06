package com.springexercises.partb.aliasredefinition;

import com.springexercises.partb.aliasredefinition.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AliasRedefinitionMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // see AppConfig.java
        System.out.println(appContext.getBean("person"));
        System.out.println(appContext.getBean("student"));
        System.out.println(appContext.getBean("worker"));
    }
}
