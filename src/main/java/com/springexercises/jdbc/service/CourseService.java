package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Course;

import java.util.Optional;

public interface CourseService {
    Iterable<Course> getCourses();

    Optional<Course> findCourse(int id);

    void saveCourse(Course course);

    Course updateCourse(Course course);

    void deleteCourse(int id);
}
