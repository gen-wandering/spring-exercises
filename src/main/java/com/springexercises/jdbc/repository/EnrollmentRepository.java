package com.springexercises.jdbc.repository;

import com.springexercises.jdbc.model.Course;
import com.springexercises.jdbc.model.Enrollment;
import com.springexercises.jdbc.model.Student;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/*
 * Repository for Student-Course manny-to-many
 * relationship
 * */
public interface EnrollmentRepository extends CrudRepository<Enrollment, Integer> {

    @Query("""
            SELECT *
            FROM courses
            WHERE id IN (SELECT course_id
                         FROM enrollments
                         WHERE student_id = :studentId)
            """)
    Iterable<Course> getStudentCourses(@Param("studentId") int studentId);

    @Query("""
            SELECT *
            FROM students
            WHERE id IN (SELECT student_id
                         FROM enrollments
                         WHERE course_id = :courseId)
            """)
    Iterable<Student> getCourseStudents(@Param("courseId") int courseId);
}
