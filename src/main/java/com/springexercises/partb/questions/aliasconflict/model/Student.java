package com.springexercises.partb.questions.aliasconflict.model;

public class Student extends Person {
    private final int scholarship;

    public Student(int age, String name, int scholarship) {
        super(age, name);
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {
        return "Student{" +
                "scholarship=" + scholarship +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
