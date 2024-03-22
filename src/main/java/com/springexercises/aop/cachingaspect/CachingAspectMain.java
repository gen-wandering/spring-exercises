package com.springexercises.aop.cachingaspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CachingAspectMain {
    public static void main(String[] args) {
        invokeAll();
    }

    /*
     * Shows the standard CachingAspect workflow that collects the
     * results of all methods.
     * */
    private static void invokeAll() {
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

    /*
     * Shows that any method calls that the object makes on itself,
     * such as this.getName() or this.getId(), are not going to be
     * invoked against the proxy.
     *
     * It means that self-invocation is not going to result in the
     * advice associated with this method to run.
     * */
    private static void selfInvocation() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean("person", Person.class);

        // Self-invoked "getAge()" won't be processed by CachingAspect.
        person.selfInvocation();
    }

    /*
     * Shows difference between calling method against the proxy and
     * the "this" reference.
     * */
    private static void proxyAndTargetObjectMethodCalls() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean("person", Person.class);

        person.proxyAndTargetObjectMethodCalls();
    }
}