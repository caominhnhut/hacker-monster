insert into authority(id, name) values (1, 'ROLE_ADMIN');
insert into authority(id, name) values (2, 'ROLE_USER');

insert into users(id, email, "password", description, timestamp_created, timestamp_modified) values (1, 'admin@gmail.com', '$2a$10$uMTsAJuIUnQlCJEQZs9PE.P5tlqLYihTEcVJtW5sEPHPxGsTIPdri', 'Solution Architure', current_timestamp, current_timestamp);
insert into users(id, email, "password", description, timestamp_created, timestamp_modified) values (2, 'test_01@gmail.com', '$2a$10$uMTsAJuIUnQlCJEQZs9PE.P5tlqLYihTEcVJtW5sEPHPxGsTIPdri', 'Senior', current_timestamp, current_timestamp);

insert into authority_role(user_id, authority_id) values (1, 1);
insert into authority_role(user_id, authority_id) values (2, 2);

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

insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (1, 'description_01', 1, 2, 1, '2020-03-07 10:01:17', '2020-03-07 10:01:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (2, 'description_02', 1, 2, 1, '2020-03-07 10:02:17', '2020-03-07 10:02:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (3, 'description_03', 1, 2, 1, '2020-03-07 10:03:17', '2020-03-07 10:03:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (4, 'description_04', 1, 2, 1, '2020-03-07 10:04:17', '2020-03-07 10:04:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (5, 'description_05', 1, 2, 1, '2020-03-07 10:05:17', '2020-03-07 10:05:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (6, 'description_06', 1, 2, 2, '2020-03-07 10:06:17', '2020-03-07 10:06:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (7, 'description_07', 1, 2, 2, '2020-03-07 10:07:17', '2020-03-07 10:07:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (8, 'description_08', 1, 2, 2, '2020-03-07 10:08:17', '2020-03-07 10:08:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (9, 'description_09', 1, 2, 2, '2020-03-07 10:09:17', '2020-03-07 10:09:17');
insert into  feed(id, description, num_of_like, num_of_sharing, owner_id, timestamp_created, timestamp_modified) values (10, 'description_10', 1, 2, 2, '2020-03-07 10:10:17', '2020-03-07 10:10:17');

insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (1, 'Commnent_01', 1, 1, '2020-03-07 10:01:17', '2020-03-07 10:01:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (2, 'Commnent_02', 1, 1, '2020-03-07 10:02:17', '2020-03-07 10:02:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (3, 'Commnent_03', 1, 1, '2020-03-07 10:03:17', '2020-03-07 10:03:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (4, 'Commnent_04', 2, 1, '2020-03-07 10:04:17', '2020-03-07 10:04:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (5, 'Commnent_05', 2, 1, '2020-03-07 10:05:17', '2020-03-07 10:05:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (6, 'Commnent_06', 2, 1, '2020-03-07 10:06:17', '2020-03-07 10:06:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (7, 'Commnent_07', 3, 2, '2020-03-07 10:07:17', '2020-03-07 10:07:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (8, 'Commnent_08', 3, 2, '2020-03-07 10:08:17', '2020-03-07 10:08:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (9, 'Commnent_09', 3, 2, '2020-03-07 10:09:17', '2020-03-07 10:09:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (10, 'Commnent_10', 4, 2, '2020-03-07 10:10:17', '2020-03-07 10:10:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (11, 'Commnent_11', 4, 2, '2020-03-07 10:11:17', '2020-03-07 10:11:17');
insert into "comment"(id, description, feed_id, owner_id, timestamp_created, timestamp_modified) values (12, 'Commnent_12', 4, 2, '2020-03-07 10:12:17', '2020-03-07 10:12:17');