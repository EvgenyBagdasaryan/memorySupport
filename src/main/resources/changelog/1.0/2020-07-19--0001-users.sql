--liquibase formatted sql

drop table if exists users;

--changeset evgeny:2020-07-19-0001-users
create table users (
                         id bigint auto_increment primary key,
                         name varchar(255) not null
)