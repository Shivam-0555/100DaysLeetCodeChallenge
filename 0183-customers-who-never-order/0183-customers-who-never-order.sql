# Write your MySQL query statement below
select c.name As Customers
from Customers c
left join Orders o
on c.id = o.customerId
where o.customerId IS NULL;