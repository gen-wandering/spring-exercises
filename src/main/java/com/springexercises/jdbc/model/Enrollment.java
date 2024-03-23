package com.springexercises.jdbc.model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table(name = "enrollments")
public class Enrollment {
    @Column(value = "enrollment_date")
    private LocalDateTime date;

    private Integer studentId;

    private Integer courseId;
}