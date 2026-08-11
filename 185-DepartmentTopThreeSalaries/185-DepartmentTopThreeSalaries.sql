-- Last updated: 11/08/2026, 14:20:34
# Write your MySQL query statement below
WITH RankedEmployees AS (
    SELECT
        e.name AS Employee,
        e.salary AS Salary,
        d.name AS Department,
        DENSE_RANK() OVER (
            PARTITION BY e.departmentId
            ORDER BY e.salary DESC
        ) AS salary_rank
    FROM Employee e
    JOIN Department d
        ON e.departmentId = d.id
)

SELECT
    Department,
    Employee,
    Salary
FROM RankedEmployees
WHERE salary_rank <= 3;