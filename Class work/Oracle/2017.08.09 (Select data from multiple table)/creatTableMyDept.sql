drop table mylocation;

drop table mydepet;

create table mydepet(
department_id number(6),
department_name varchar2(30),
location_id number(6),
depet_code varchar2(10));

create table mylocation(
location_id number(6),
city varchar2(15),
depet_code varchar2(10));