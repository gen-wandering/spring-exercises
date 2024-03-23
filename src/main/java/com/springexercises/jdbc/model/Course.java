package com.springexercises.jdbc.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Data
@Table(name = "courses")
public class Course {
    @Id
    private Integer id;

    private String theme;

    @MappedCollection(idColumn = "course_id")
    private Set<Enrollment> enrollments;

    public Course(String theme) {
        this.theme = theme;
    }
}