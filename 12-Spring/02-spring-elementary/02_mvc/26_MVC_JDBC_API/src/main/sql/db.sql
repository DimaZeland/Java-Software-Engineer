CREATE USER 'postgres'@'localhost' IDENTIFIED BY 'postgres';

GRANT ALL PRIVILEGES ON * . * TO 'postgres'@'localhost';

CREATE DATABASE  first_db;
USE first_db;



CREATE TABLE Person (
  id int,
  name varchar,
  age int,
  email varchar
);

INSERT INTO Person (id, name, age, email)
VALUES
	(1, 'Tom', 18, 'tom@gmail.com'),
	(2, 'Bob', 28, 'bob@gmail.com'),
	(3, 'Stiv', 38, 'stiv@gmail.com'),
	(4, 'Edisson', 48, 'edisson@gmail.com');