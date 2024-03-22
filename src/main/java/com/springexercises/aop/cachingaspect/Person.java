package com.springexercises.aop.cachingaspect;

import java.time.LocalDateTime;

public class Person {
    private int id;
    private int age;
    private String name;
    private String surname;

    public Person(int id, int age, String name, String surname) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        System.out.println("in person.getId()");
        return id;
    }

    public int getAge() {
        System.out.println("in person.getAge()");
        return age;
    }

    public String getName() {
        System.out.println("in person.getName()");
        return name;
    }

    public String getSurname() {
        System.out.println("in person.getSurname()");
        return surname;
    }

    @Track
    public String specialMethod() {
        System.out.println("in person.specialMethod()");
        return "Person " + LocalDateTime.now();
    }

    public void selfInvocation() {
        /*
         * Self-invocations are not going to be invoked
         * against the proxy.
         *
         * So "this.getAge()" won't be processed by CachingAspect.
         * */
        this.getAge(); // self-invocation
        System.out.println("in person.selfInvocation()");
    }

    public void proxyAndTargetObjectMethodCalls() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
