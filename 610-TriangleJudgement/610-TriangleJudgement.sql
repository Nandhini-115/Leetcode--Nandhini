-- Last updated: 11/08/2026, 14:17:39
# Write your MySQL query statement below
SELECT
    x, y,z,
    CASE
        WHEN x + y > z
         AND x + z > y
         AND y + z > x
        THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle;