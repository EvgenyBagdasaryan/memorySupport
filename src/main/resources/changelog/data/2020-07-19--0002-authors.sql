--liquibase formatted sql

--changeset evgeny:2020-07-19-0002-authors
insert into authors (id, name)
values (1, 'Братья Стругатские'),
       (2, 'Станислав Лем'),
       (3, 'Айзек Азимов'),
       (4, 'Агата Кристи'),
       (5, 'Жорж Санд'),
       (6, 'Валентина Шах-Назарова')
