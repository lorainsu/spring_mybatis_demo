-- liquibase formatted sql
-- changeset mychangeset:1.0.1

CREATE TABLE IF NOT EXISTS mydb.users (
    id          int not null auto_increment,
    username    varchar(50),
    password    varchar(50),
    primary key (id)
);

