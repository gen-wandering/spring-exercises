CREATE TABLE students
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(25) NOT NULL,
    last_name  VARCHAR(25) NOT NULL,
    email      VARCHAR(40) NOT NULL,
    age        INT         NOT NULL
);

CREATE TABLE books
(
    id         SERIAL PRIMARY KEY,
    student_id INT REFERENCES students (id),
    book_name  VARCHAR(50) NOT NULL
);

CREATE TABLE courses
(
    id    SERIAL PRIMARY KEY,
    theme VARCHAR(100)
);

CREATE TABLE enrollments
(
    id              SERIAL PRIMARY KEY,
    student_id      INT NOT NULL,
    course_id       INT NOT NULL,
    enrollment_date TIMESTAMP WITH TIME ZONE,

    UNIQUE (student_id, course_id),
    FOREIGN KEY (student_id) REFERENCES students (id),
    FOREIGN KEY (course_id) REFERENCES courses (id)
);