# Write your MySQL query statement below
# Write your MySQL query statement below

select lb.book_id, lb.title, lb.author, lb.genre, lb.publication_year, lb.total_copies as current_borrowers
from library_books lb
inner join (
    select book_id, count(*) as totalBookBorrowed
    from borrowing_records
    where return_date is null
    group by book_id
) br
on br.book_id = lb.book_id and br.totalBookBorrowed = lb.total_copies
order by current_borrowers desc, lb.title