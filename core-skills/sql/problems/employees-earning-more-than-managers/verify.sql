-- Expect exactly one row: 'Henry'
WITH res AS (
  SELECT e.name AS employee
  FROM Employee e
  JOIN Employee m ON e.managerId = m.id
  WHERE e.salary > m.salary
)
SELECT CASE WHEN COUNT(*) = 1 AND MIN(employee) = 'Henry' THEN 1 ELSE 0 END AS ok
FROM res;
