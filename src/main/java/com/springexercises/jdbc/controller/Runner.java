package com.springexercises.jdbc.controller;

import com.springexercises.jdbc.repository.CourseRepository;
import com.springexercises.jdbc.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Override
    public void run(String... args) {
        studentRepository.deleteById(1);
    }
}