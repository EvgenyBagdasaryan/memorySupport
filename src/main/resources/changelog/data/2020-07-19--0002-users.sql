--liquibase formatted sql

--changeset evgeny:2020-07-19-0002-authors
insert into users (id, name)
values (1, 'пользак 1'),
       (2, 'пользак 2'),
       (3, 'пользак 3'),
       (4, 'пользак 4'),
       (5, 'пользак 5')
