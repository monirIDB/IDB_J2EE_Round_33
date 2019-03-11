CREATE TABLE emp_info(
emp_id number(6) primary key,
emp_name varchar2(30),
manager_id number(4),
phone number(15),
sex varchar2(20) check(sex='Female' or sex='Male'),
salary number default 5000);

insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(101, 'Monir', 11, 029328347, 'Male', 15000);

insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(102, 'Billal', 12, 853464, 'Male', 10000);

CREATE SEQUENCE emp_id
		INCREMENT BY 1
		START WITH 103
		NOMAXVALUE 
		NOCACHE
		NOCYCLE;

		
insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(emp_id.nextval, 'fatema', 13, 83743843, 'Female', 7000);

insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(emp_id.nextval, 'Nasrin', 12, 46667, 'Female', 8000);

insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(emp_id.nextval, 'Sharmin', 13, 547765545, 'Female', 9000);

alter table emp_info
add dep_id number(4);

create table dept123(
dep_id number(4) primary key,
dep_name varchar2(30),
manager_id number(4),
dep_location varchar2(20));

CREATE SEQUENCE dep
		INCREMENT BY 1
		START WITH 200
		NOMAXVALUE 
		NOCACHE
		NOCYCLE;
		
insert into dept123(dep_id, dep_name, manager_id, dep_location)
values(dep.nextval, 'HR', 12, 'Dhaka');
insert into dept123(dep_id, dep_name, manager_id, dep_location)
values(dep.nextval, 'IT', 13, 'Khulna');
insert into dept123(dep_id, dep_name, manager_id, dep_location)
values(dep.nextval, 'HR', 11, 'Sylhet');
insert into dept123(dep_id, dep_name, manager_id, dep_location)
values(dep.nextval, 'IT', 13, 'Dhaka');
insert into dept123(dep_id, dep_name, manager_id, dep_location)
values(dep.nextval, 'HR', 11, 'Khulna');


update emp_info
set dep_id=202;


CREATE VIEW TWOVI
AS SELECT E.CUSTOMER_ID,E.CUSTOMER_NAME,E.GENDER,E.SALARY,D.DEPARTMENT_ID,D.LOCATION,D.DEP_NAME
FROM EMPINFO E JOIN MY_DEPARTMENTS D
ON (E.DEPARTMENT_ID=D.DEPARTMENT_ID);

--select all from TWOVI
SELECT * 
FROM TWOVI;

--QUERRY
SELECT CUSTOMER_ID,CUSTOMER_NAME,SALARY,GENDER,DEP_NAME
FROM TWOVI
WHERE DEP_NAME='MARKETING' AND GENDER='F';





