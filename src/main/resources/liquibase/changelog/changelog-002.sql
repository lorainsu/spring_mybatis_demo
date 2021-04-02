-- liquibase formatted sql
-- changeset mychangeset:1.0.2

CREATE TABLE IF NOT EXISTS mydb.department (
    id          int not null auto_increment,
    dept_name    varchar(50),
    primary key (id)
);

INSERT INTO mydb.department VALUES ( 1, 'root' );

