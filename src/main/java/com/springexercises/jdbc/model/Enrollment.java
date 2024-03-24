package com.springexercises.jdbc.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Table(name = "enrollments")
public class Enrollment {
    @Id
    private Integer id;

    @Column(value = "enrollment_date")
    private LocalDateTime date;

    private Integer studentId;

    private Integer courseId;

    public Enrollment(LocalDateTime date, Integer studentId, Integer courseId) {
        this.date = date;
        this.studentId = studentId;
        this.courseId = courseId;
    }
}