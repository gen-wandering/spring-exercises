package com.springexercises.partb.cyclicdependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CyclicDependencyMain {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(context.getBean("beanA", BeanA.class));
        System.out.println(context.getBean("beanB", BeanB.class));
    }
}