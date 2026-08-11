-- Last updated: 11/08/2026, 14:17:47
# Write your MySQL query statement below
SELECT class
FROM Courses
GROUP BY class
HAVING COUNT(student) >= 5;