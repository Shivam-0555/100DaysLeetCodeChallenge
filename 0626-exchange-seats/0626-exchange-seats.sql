# Write your MySQL query statement below
SELECT 
    CASE
        WHEN ID % 2 = 0 THEN ID-1 
        WHEN (id = (SELECT MAX(ID) FROM SEAT)) THEN ID
        WHEN NOT MOD(ID,2)=0 THEN ID +1
    END AS ID, STUDENT
FROM SEAT
ORDER BY ID;