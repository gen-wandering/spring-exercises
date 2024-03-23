package com.springexercises.jdbc.repository;

import com.springexercises.jdbc.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
