select *
from employees
where job_id=(select job_id
			from employees
			where employee_id=141)
and salary>(select salary 
			from employees
			where employee_id=143);
			
select First_name, last_name, salary, job_id
from employees
where job_id=(select job_id
			from employees
			where employee_id=141)
and salary>(select salary 
			from employees
			where employee_id=143);