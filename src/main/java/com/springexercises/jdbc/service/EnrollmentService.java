package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Course;
import com.springexercises.jdbc.model.Student;

public interface EnrollmentService {
    void enroll(int studentId, int courseId);

    void expel(int studentId, int courseId);

    Iterable<Course> getStudentCourses(int studentId);

    Iterable<Student> getCourseStudents(int courseId);

    void saveStudentAndCourse(Student student, Course course);
}
