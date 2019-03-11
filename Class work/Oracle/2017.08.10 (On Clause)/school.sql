drop table school
create table school(
S_ID number(6) primary key,
student_name varchar2(30),
S_Name varchar2(60),
location varchar2(15),
email varchar2(35));

insert into school(S_ID, student_name, S_Name, location, email)
values (100, 'Morad', 'Rajdhani School', 'Dhaka', 'rajdhani@gmail.com');

insert into school(S_ID, student_name, S_Name, location, email)
values (101, 'Mamun', 'blue bird School', 'sylhet', 'birdschool@gmail.com');

insert into school(S_ID, student_name, S_Name, location, email)
values (102, 'city School', 'khulna', 'city@gmail.com');

insert into school(S_ID, student_name, S_Name, location, email)
values (103, 'rajdhani school', 'dhaka', 'birdschool@gmail.com');