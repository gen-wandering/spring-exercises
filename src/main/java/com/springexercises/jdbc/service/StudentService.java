package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Student;

import java.util.Optional;

public interface StudentService {
    Iterable<Student> getStudents();

    Optional<Student> findStudent(int id);

    void saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(int id);
}
