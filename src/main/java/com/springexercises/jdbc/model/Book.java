package com.springexercises.jdbc.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@Table(value = "books")
public class Book {
    @Id
    private Integer id;

    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }
}