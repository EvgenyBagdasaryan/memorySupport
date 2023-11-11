--liquibase formatted sql

drop table if exists authors;

--changeset evgeny:2020-07-19-0001-authors
create table authors (
                         id bigint auto_increment primary key,
                         name varchar(255) not null
)