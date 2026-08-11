-- Last updated: 11/08/2026, 14:20:41
# Write your MySQL query statement below
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;