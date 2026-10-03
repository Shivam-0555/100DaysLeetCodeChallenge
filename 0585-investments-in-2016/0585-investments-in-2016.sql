# Write your MySQL query statement below
select
    round(sum(tiv_2016), 2) as tiv_2016
from
    (
        select
            *
            , count(*) over (partition by tiv_2015) as tiv_2015_cnt
            , count(*) over (partition by lat, lon) as location_cnt
        from
            insurance
    ) t -- every derived table must have its own alias
where tiv_2015_cnt > 1 and location_cnt = 1