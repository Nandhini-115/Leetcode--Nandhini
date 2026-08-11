-- Last updated: 11/08/2026, 14:17:38
# Write your MySQL query statement below
SELECT 
    CASE
        WHEN id % 2 = 1 AND id <> (SELECT COUNT(*) FROM Seat) 
            THEN id + 1
        WHEN id % 2 = 0 
            THEN id - 1
        ELSE id
    END AS id,
    student
FROM Seat
ORDER BY id;