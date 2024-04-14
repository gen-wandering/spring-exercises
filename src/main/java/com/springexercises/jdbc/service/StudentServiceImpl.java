package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Student;
import com.springexercises.jdbc.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Student> getStudents() {
        return repository.findAll();
    }

    @Override
    public Optional<Student> findStudent(int id) {
        // logger.error("error!!!!!!!!!!!!!!!!");
        // logger.warn("warn!!!!!!!!!!!!!!!!!!");
        // logger.info("info!!!!!!!!!!!!!!!!!!");
        // logger.debug("debug!!!!!!!!!!!!!!!!");
        // logger.trace("trace!!!!!!!!!!!!!!!!");
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
