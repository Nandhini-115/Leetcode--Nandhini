-- Last updated: 11/08/2026, 14:18:00
# Write your MySQL query statement below
SELECT name
FROM Employee
WHERE id IN (
    SELECT managerId
    FROM Employee
    WHERE managerId IS NOT NULL
    GROUP BY managerId
    HAVING COUNT(managerId) >= 5
);