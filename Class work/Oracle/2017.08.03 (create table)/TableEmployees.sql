create table Emp(
				Employee_ID number(6) primary key,
				Employee_Name varchar2(30),
				Father_Name varchar2(30),
				Mother_Name varchar2(30),
				Emp_Department number(6) constreint emp_dept_fk references depart(Department_ID),
				Email varchar2(35),
				Phone number(11),
				Adress varchar2(40));

insert into emp(Employee_ID,Employee_Name,Father_Name,Mother_Name,Emp_department,Email,Phone,Adress)
