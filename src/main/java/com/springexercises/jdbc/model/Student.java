package com.springexercises.jdbc.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Table("students")
public class Student {
    @Id
    private Integer id;

    @Column(value = "first_name")
    private String name;

    @Column(value = "last_name")
    private String surname;

    private String email;

    private int age;

    /*
     * Books are ORDERED BY book_name
     * */
    @MappedCollection(idColumn = "student_id", keyColumn = "book_name")
    private List<Book> books;

    @MappedCollection(idColumn = "student_id")
    private Set<Enrollment> enrollments;

    public Student(String name, String surname, String email, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }
}