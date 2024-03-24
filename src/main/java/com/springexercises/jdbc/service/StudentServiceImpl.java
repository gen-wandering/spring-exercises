package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Student;
import com.springexercises.jdbc.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> findStudent(int id) {
        return repository.findById(id);
    }

    @Override
    public void saveStudent(Student student) {
        repository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
}
