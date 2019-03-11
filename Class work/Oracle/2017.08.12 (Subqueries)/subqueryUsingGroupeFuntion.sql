select last_name, job_ID, salary
from employees
where salary=(select min(salary)
		from employees);
		
select last_name, job_ID, salary
from employees
where salary= min(salary);
		
		<--group function is not allowed in where condition.
		
select last_name, job_ID, min(salary)
from employees
having salary= min(salary)
group by last_name;