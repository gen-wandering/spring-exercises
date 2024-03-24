TRUNCATE students, courses RESTART IDENTITY CASCADE;

INSERT INTO courses (theme)
VALUES ('Architecture'),
       ('Computer and Information Sciences'),
       ('Construction Trades'),
       ('Engineering');

INSERT INTO students (first_name, last_name, email, age)
VALUES ('Quinton', 'Bins', 'quinton.bins@bestmail.org', 20),
       ('Gustavo', 'Muller', 'gustavo.muller@bestmail.org', 24),
       ('Shannan', 'Bahringer', 'shannan.bahringer@bestmail.org', 28),
       ('Cory', 'Bechtelar', 'cory.bechtelar@bestmail.org', 28),
       ('Lamont', 'Olson', 'lamont.olson@bestmail.org', 23),
       ('Jacqulyn', 'Kohler', 'jacqulyn.kohler@bestmail.org', 28),
       ('Jennine', 'Gerhold', 'jennine.gerhold@bestmail.org', 22),
       ('Kirk', 'Leannon', 'kirk.leannon@bestmail.org', 27),
       ('Jose', 'Kulas', 'jose.kulas@bestmail.org', 23),
       ('Fannie', 'Botsford', 'fannie.botsford@bestmail.org', 20);

INSERT INTO books (student_id, book_name)
VALUES (1, 'An Acceptable Time'),
       (1, 'Paths of Glory'),
       (1, 'A Monstrous Regiment of Women'),
       (2, 'A Time of Gifts'),
       (3, 'Specimen Days'),
       (3, 'The Soldier''s Art'),
       (3, 'Shall not Perish'),
       (4, 'Absalom, Absalom!'),
       (4, 'The Last Temptation'),
       (4, 'The Skull Beneath the Skin'),
       (5, 'The Violent Bear It Away'),
       (5, 'That Hideous Strength'),
       (6, 'Everything is Illuminated'),
       (6, 'Blood''s a Rover'),
       (7, 'East of Eden'),
       (7, 'The Skull Beneath the Skin'),
       (7, 'Now Sleeps the Crimson Petal'),
       (8, 'To Your Scattered Bodies Go'),
       (9, 'Bury My Heart at Wounded Knee'),
       (9, 'I Will Fear No Evil'),
       (9, 'Behold the Man'),
       (9, 'Everything is Illuminated'),
       (10, 'A Swiftly Tilting Planet'),
       (10, 'The Mirror Crack''d from Side to Side');

INSERT INTO enrollments (student_id, course_id, enrollment_date)
VALUES (1, 3, '2023-10-11 11:35:52.965975 +00:00'),
       (2, 4, '2023-10-09 11:35:52.989413 +00:00'),
       (2, 2, '2023-10-07 11:35:52.991415 +00:00'),
       (3, 1, '2023-10-08 11:35:52.994415 +00:00'),
       (3, 2, '2023-10-02 11:35:52.996415 +00:00'),
       (4, 3, '2023-10-08 11:35:52.999415 +00:00'),
       (4, 1, '2023-10-06 11:35:53.001415 +00:00'),
       (5, 3, '2023-10-08 11:35:53.002415 +00:00'),
       (6, 2, '2023-10-06 11:35:53.005415 +00:00'),
       (7, 1, '2023-10-05 11:35:53.007531 +00:00'),
       (7, 3, '2023-09-29 11:35:53.009532 +00:00'),
       (8, 4, '2023-10-06 11:35:53.010533 +00:00'),
       (9, 1, '2023-10-03 11:35:53.012532 +00:00'),
       (10, 2, '2023-09-27 11:35:53.014532 +00:00'),
       (10, 4, '2023-09-24 11:35:53.015533 +00:00');

SELECT *
FROM students;

SELECT *
FROM courses;

SELECT *
FROM books;

SELECT *
FROM enrollments;

--students with courses
SELECT s.id, s.first_name, s.last_name, c.id, c.theme
FROM students s
         JOIN enrollments e ON s.id = e.student_id
         JOIN courses c ON e.course_id = c.id
ORDER BY s.id, c.id;