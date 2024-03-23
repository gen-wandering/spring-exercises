package com.springexercises.jdbc.repository;

import com.springexercises.jdbc.model.Student;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

    @Modifying
    @Query("UPDATE students SET email = :email WHERE first_name = :name")
    void changeEmailByName(@Param("name") String name, @Param("email") String email);
}