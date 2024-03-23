package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Student;

public interface StudentService {
    Iterable<Student> getStudents();

    Student findStudent(int id);

    void saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(int id);
}
