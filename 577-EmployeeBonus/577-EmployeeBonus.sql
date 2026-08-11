-- Last updated: 11/08/2026, 14:17:55
# Write your MySQL query statement below
SELECT 
    e.name,
    b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;