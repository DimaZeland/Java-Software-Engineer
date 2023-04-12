DROP TABLE IF EXISTS Person;

CREATE TABLE Person(
    id int PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
    name varchar(100),
    age int
);

ALTER TABLE Person ADD COLUMN email VARCHAR(100) UNIQUE;

TRUNCATE TABLE Person;

INSERT INTO Person(id, name, age)
VALUES (1, 'Test person', 20);

SELECT * FROM Person;

-- CREATE SEQUENCE person_id_seq;

CREATE TABLE Item(
                       id int PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY,
                       person_id int REFERENCES Person(id),
                       item_name varchar(100)
);