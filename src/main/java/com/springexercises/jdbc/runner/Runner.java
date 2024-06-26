package com.springexercises.jdbc.runner;

import com.springexercises.jdbc.model.Course;
import com.springexercises.jdbc.model.Student;
import com.springexercises.jdbc.service.EnrollmentService;
import com.springexercises.jdbc.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Runner implements CommandLineRunner {
    private final StudentService studentService;
    private final EnrollmentService enrollmentService;

    @Override
    public void run(String... args) {
//        System.out.println(studentService.findStudent(12));
//        enrollExpelExample();

        enrollmentService.saveStudentAndCourse(
                new Student("1", "1", "1", 1),
                new Course("test")
        );
    }

    private void enrollExpelExample() {
        enrollStudentInCourse();
        System.out.println("\n");
        expelStudentFromCourse();
    }

    private void enrollStudentInCourse() {
        System.out.println("Student courses before enrollment in one more course:");
        enrollmentService.getStudentCourses(1).forEach(System.out::println);
        System.out.println("Course students before enrollment:");
        enrollmentService.getCourseStudents(1).forEach(System.out::println);

        System.out.println();
        // Enrollment
        enrollmentService.enroll(1, 1);

        System.out.println("Student courses after enrollment in one more course:");
        enrollmentService.getStudentCourses(1).forEach(System.out::println);
        System.out.println("Course students after enrollment:");
        enrollmentService.getCourseStudents(1).forEach(System.out::println);
    }

    private void expelStudentFromCourse() {
        System.out.println("Student courses before expelling from course:");
        enrollmentService.getStudentCourses(1).forEach(System.out::println);
        System.out.println("Course students before expelling:");
        enrollmentService.getCourseStudents(1).forEach(System.out::println);

        System.out.println();
        // Expelling
        enrollmentService.expel(1, 1);

        System.out.println("Student courses after expelling from course:");
        enrollmentService.getStudentCourses(1).forEach(System.out::println);
        System.out.println("Course students after expelling: ");
        enrollmentService.getCourseStudents(1).forEach(System.out::println);
    }
}