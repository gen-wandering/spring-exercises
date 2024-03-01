package com.springexercises.partb.questions.aliasconflict.model;

public class Worker extends Person {
    private final int salary;

    public Worker(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
