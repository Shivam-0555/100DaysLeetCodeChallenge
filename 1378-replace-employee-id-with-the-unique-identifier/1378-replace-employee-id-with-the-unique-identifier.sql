# Write your MySQL query statement below
select unique_id, name
from Employees E
left join EmployeeUNI u
on E.id = U.id;