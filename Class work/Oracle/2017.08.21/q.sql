
drop table emp_info;
create table emp_info(
	emp_id number(4) primary key,
	emp_name varchar2(30),
	manager_id number(4),
	phone number(15),
	sex varchar2(10) check(sex='Male' or sex='Female'),
	salary number(10) default 7000);
	
insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(101, 'Amin', 201, 837373638, 'Male', 12000);
insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(102, 'Nasrin', 201, 8345645638, 'Female', 11000);

create sequence ep_id
	increment by 1
	start with 103
	nomaxvalue
	nochache
	nocycle;
	
insert into emp_info(ep_id, emp_name, manager_id, phone, sex, salary)
values(ep_id.nextval, 'Fatema', 202, 8344365638, 'Female', 8000);
insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(ep_id.nextval, 'Sharmin', 202, 8978665638, 'Female', 17000);
insert into emp_info(emp_id, emp_name, manager_id, phone, sex, salary)
values(ep_id.nextval, 'Monir', 201, 8345645638, 'Male', 14000);

alter table emp_info
add (dept_id number(4));


drop table depts;

create table depts(
	dep_id number(4) primary key,
	dep_name varchar2(20),
	manager_id number(4),
	dep_location varchar2(20));
	
create sequence dpt_id
	increment by 1
	start with 301
	nomaxvalue
	nochache
	nocycle;
	
insert into depts( dept_id, dep_name, manager_id, dep_location)
values(dpt_id.nextval, 'HR', 201, 'Dhaka');
insert into depts( dept_id, dep_name, manager_id, dep_location)
values(dpt_id.nextval, 'HR', 201, 'Dhaka');
insert into depts( dept_id, dep_name, manager_id, dep_location)
values(dpt_id.nextval, 'IT', 202, 'Sylhet');
insert into depts( dept_id, dep_name, manager_id, dep_location)
values(dpt_id.nextval, 'IT', 202, 'Sylhet');
insert into depts( dept_id, dep_name, manager_id, dep_location)
values(dpt_id.nextval, 'MK', 203, 'Khulna');

update emp_info
set dept_id=301
where emp_id=101;
update emp_info
set dept_id=304
where emp_id=102;
update emp_info
set dept_id=305
where emp_id=103;
update emp_info
set dept_id=302
where emp_id=104;
update emp_info
set dept_id=303
where emp_id=105;

create or replace view emp_vu
as select e.emp_id,e.emp_name,e.sex,e.salary,e.phone, d.dept_id,d.dept_name,d.manager_id,dept_location
from emp_info e join depts d
on (e.dept_id=d.dept_id);

select emp_name,phone, dept_name
from emp_vu
where dept_id in(301,304) and sex='male';


