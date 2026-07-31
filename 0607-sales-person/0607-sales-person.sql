# Write your MySQL query statement below
select name 
from SalesPerson
where sales_id NOT IN ( select o.sales_id
from  Orders o join Company c
on o.com_id = c.com_id
where c.name ='RED');