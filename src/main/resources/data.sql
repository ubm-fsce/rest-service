create table course_BKP
(
   id integer not null,
   name varchar(255) not null,
   primary key(id)
);
INSERT INTO course_details(ID, FULL_NAME, last_Updated_Date_Time, created_Date_Time ) VALUES(10001,  'JPA in 50 Steps', sysdate(), sysdate() );
INSERT INTO course_details(ID, FULL_NAME, last_Updated_Date_Time, created_Date_Time) VALUES(10002,  'Java 8 in 50 Steps', sysdate(), sysdate() );
INSERT INTO course_details(ID, FULL_NAME, last_Updated_Date_Time, created_Date_Time) VALUES(10003,  'K8S in 50 Steps', sysdate(), sysdate() );
INSERT INTO course_details(ID, FULL_NAME, last_Updated_Date_Time, created_Date_Time) VALUES(10004,  'Microservices in 50 Steps', sysdate(), sysdate() );


create table person_bkp
(
   id integer not null,
   name varchar(255) not null,
   location varchar(255),
   birth_date timestamp,
   primary key(id)
);


INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10010,  'Ranga', 'Hyderabad',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10002,  'James', 'New York',sysdate());
INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE )
VALUES(10003,  'Pieter', 'Amsterdam',sysdate());


insert into STUDENT(id,name) values (20001,'NAME1');
insert into STUDENT(id,name) values (20002,'NAME2');
insert into STUDENT(id,name) values (20003,'NAME3');
insert into STUDENT(id,name) values (20004,'NAME4');