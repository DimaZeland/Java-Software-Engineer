DROP TABLE IF EXISTS Person;

CREATE TABLE Person (
    id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name varchar(100) NOT NULL UNIQUE,
    age int NOT NULL CHECK(age > 0),
    email varchar(100) NOT NULL
                    );

ALTER TABLE Person ADD COLUMN created_at TIMESTAMP,
                   ADD COLUMN updated_at TIMESTAMP,
                   ADD COLUMN created_who VARCHAR;

TRUNCATE TABLE Person;

INSERT INTO Person (name, age, email, created_at, updated_at, created_who) VALUES
('Alex', 20, 'alex@gmail.com', '2023-04-17 11:36:03.232829', '2023-04-17 11:36:03.232829', 'ADMIN'),
('Stefany', 30, 'stefany@gmail.com', '2023-04-17 11:36:03.232829', '2023-04-17 11:36:03.232829', 'ADMIN'),
('Bob', 40, 'bob@gmail.com', '2023-04-17 11:36:03.232829', '2023-04-17 11:36:03.232829', 'ADMIN')
;


SELECT * FROM Person;
