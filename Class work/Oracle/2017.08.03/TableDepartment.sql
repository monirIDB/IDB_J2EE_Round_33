drop table Emp1;
drop table depart;

create table Depart(
Department_ID number(6) primary key,
Department_Name varchar2(20),
Location varchar2(15),
Department_manager varchar2(20),
Opening_Date date);
insert into Depart(Department_ID,Department_Name,Location,Department_manager,Opening_Date)
values (100,'IT','Dhaka',null,sysdate);
insert into Depart(Department_ID,Department_Name,Location,Department_manager,Opening_Date)
values (101,'MK','Sylhet','Shibli','23-Jun-1990');
insert into Depart(Department_ID,Department_Name,Location,Department_manager,Opening_Date)
values (102,'HR','Khulna','Billal','23-Aug-1998');
insert into Depart(Department_ID,Department_Name,Location,Department_manager,Opening_Date)
values (103,'AC','Rajshahi','Asraf','10-Dec-1970');

create table Emp1(
				Employee_ID number(6) primary key,
				Employee_Name varchar2(30),
				Father_Name varchar2(30),
				Mother_Name varchar2(30),
				Emp_Department number(6) constraint dept_fk references depart(Department_ID),
				Email varchar2(35),
				Phone number(11),
				Adress varchar2(40));
insert into emp1(Employee_ID,Employee_Name,Father_Name,Mother_Name,Emp_department,Email,Phone,Adress)
values (200,'Murad','Kamal','Khatun',103,'hsyegy@gmail.com',0172635478,'Dhaka');
insert into emp1(Employee_ID,Employee_Name,Father_Name,Mother_Name,Emp_department,Email,Phone,Adress)
values (201,'Mamun','Jamal','Salma',101,'fgddy@gmail.com',0172645656,'Khulna');
insert into emp1(Employee_ID,Employee_Name,Father_Name,Mother_Name,Emp_department,Email,Phone,Adress)
values (202,'POlas','Rahim','Nazma',102,'dffdfy@gmail.com',017245458,'Sylhet');
insert into emp1(Employee_ID,Employee_Name,Father_Name,Mother_Name,Emp_department,Email,Phone,Adress)
values (203,'Anis','Akas','Tamanna',101,'dfddy@gmail.com',017256568,'Rajshahi');
insert into emp1(Employee_ID,Employee_Name,Father_Name,Mother_Name,Emp_department,Email,Phone,Adress)
values (204,'Anis','Akas','Tamanna',103,'dfddy@gmail.com',017256568,'Rajshahi');
select *
from depart;
select *
from emp1;




