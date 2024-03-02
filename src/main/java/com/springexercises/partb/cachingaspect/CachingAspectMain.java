package com.springexercises.partb.cachingaspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CachingAspectMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean("person", Person.class);

        person.getName();
        person.getId();
        person.getAge();
        person.getSurname();
        person.specialMethod();

        var cache = context.getBean("cachingAspect", CachingAspect.class).getCache();

        System.out.println("\nCached values and methods:\n");

        cache.forEach((method, result) -> System.out.println(method + ": " + result));
    }
}