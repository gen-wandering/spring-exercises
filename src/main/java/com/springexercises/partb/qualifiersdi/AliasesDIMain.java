package com.springexercises.partb.qualifiersdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AliasesDIMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        var res = context.getBean("university", University.class);

        System.out.println(res);
    }
}
