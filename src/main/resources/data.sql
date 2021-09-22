/*in case of jpa schema update create table for entity class
 * create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
*/

insert into person (id, name, location, birth_date)
values (10001, 'Raghu', 'Delhi', sysdate());
insert into person (id, name, location, birth_date)
values (10002, 'Krishna', 'Jaipur', sysdate());
insert into person (id, name, location, birth_date)
values (10003, 'Shiva', 'Banglore', sysdate());