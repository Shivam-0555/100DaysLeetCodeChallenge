select
user_id,
name,
mail
from
users
where 
mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' 
and mail like binary '%@leetcode.com';