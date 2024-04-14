package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Course;
import com.springexercises.jdbc.repository.CourseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class CourseServiceImpl implements CourseService {
    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Course> getCourses() {
        return repository.findAll();
    }

    @Override
    public Optional<Course> findCourse(int id) {
        return repository.findById(id);
    }

    @Override
    public void saveCourse(Course course) {
        repository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public void deleteCourse(int id) {
        repository.deleteById(id);
    }
}
