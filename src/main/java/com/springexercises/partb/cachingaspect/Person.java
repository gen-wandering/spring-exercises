package com.springexercises.partb.cachingaspect;

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
