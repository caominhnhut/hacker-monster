insert into authority(id, name) values (1, 'ROLE_ADMIN');
insert into authority(id, name) values (2, 'ROLE_USER');

insert into users(id, email, "password", description, timestamp_created, timestamp_modified) values (1, 'admin@gmail.com', '$2a$10$uMTsAJuIUnQlCJEQZs9PE.P5tlqLYihTEcVJtW5sEPHPxGsTIPdri', 'Solution Architure', current_timestamp, current_timestamp);

insert into authority_role(user_id, authority_id) values (1, 1);

insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (1, 'JAVA', 'Java Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (2, 'C-SHARP', 'C# Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (3, 'JAVASCRIPT', 'JavaScript Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (4, 'DATABASE', 'Database Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (5, 'HTML - CSS', 'Design Web Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (6, 'MOBILE', 'Mobile Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (7, 'PYTHON', 'Python Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (8, 'GOLANG', 'GoLang Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (9, 'KOTLIN', 'Kotlin Programming Tutorial', 1, current_timestamp, current_timestamp);
insert into topic(id, "name", description, owner_id, timestamp_created, timestamp_modified) values (10, 'SCALAR', 'Kotlin Programming Tutorial', 1, current_timestamp, current_timestamp);