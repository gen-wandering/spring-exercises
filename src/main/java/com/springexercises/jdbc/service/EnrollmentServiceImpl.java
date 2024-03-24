package com.springexercises.jdbc.service;

import com.springexercises.jdbc.model.Course;
import com.springexercises.jdbc.model.Enrollment;
import com.springexercises.jdbc.model.Student;
import com.springexercises.jdbc.repository.EnrollmentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    private final StudentService studentService;
    private final CourseService courseService;
    private final EnrollmentRepository enrollmentRepository;

    public EnrollmentServiceImpl(StudentService studentService,
                                 CourseService courseService,
                                 EnrollmentRepository enrollmentRepository) {
        this.studentService = studentService;
        this.courseService = courseService;
        this.enrollmentRepository = enrollmentRepository;
    }

    @Override
    public void enroll(int studentId, int courseId) {
        Optional<Student> studentOptional = studentService.findStudent(studentId);
        Optional<Course> courseOptional = courseService.findCourse(courseId);

        if (studentOptional.isPresent() && courseOptional.isPresent()) {
            Student student = studentOptional.get();

            student.getEnrollments().add(new Enrollment(LocalDateTime.now(), studentId, courseId));
            studentService.saveStudent(student);
        }
    }

    @Override
    public void expel(int studentId, int courseId) {
        Optional<Student> studentOptional = studentService.findStudent(studentId);
        Optional<Course> courseOptional = courseService.findCourse(courseId);

        if (studentOptional.isPresent() && courseOptional.isPresent()) {
            Student student = studentOptional.get();

            student.getEnrollments().removeIf(enrollment -> enrollment.getCourseId() == courseId);
            studentService.saveStudent(student);
        }
    }

    @Override
    public Iterable<Course> getStudentCourses(int studentId) {
        return enrollmentRepository.getStudentCourses(studentId);
    }

    @Override
    public Iterable<Student> getCourseStudents(int courseId) {
        return enrollmentRepository.getCourseStudents(courseId);
    }
}
