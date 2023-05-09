--liquibase formatted sql

--changeset zeland:1
ALTER TABLE users
ADD COLUMN image VARCHAR(64);

--changeset zeland:2
ALTER TABLE users_aud
ADD COLUMN image VARCHAR(64);