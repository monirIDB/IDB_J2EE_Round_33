select department_id, department_name, location_id, city
from mydepet
natural join mylocation;

select department_id, department_name, location_id, city
from mylocation
natural join mydepet;

select *
from mydepet
natural join mylocation;

select department_id, department_name, t.location_id, city, depet_code
from mydepet t join  mylocation
using (depet_code);