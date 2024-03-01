package com.springexercises.partb.qualifiersdi;

public class Person {
    private final int id;
    private final String occupation;

    public Person(int id, String occupation) {
        this.id = id;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
