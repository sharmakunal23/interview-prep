/*
Title: Employees Earning More Than Their Managers (LC 181)
Link: https://leetcode.com/problems/employees-earning-more-than-their-managers/
Approach: Self-join Employee on managerId; filter where e.salary > m.salary.
Complexity: O(n) with index on managerId; hash join in practice.
*/

SELECT e.name AS Employee
FROM Employee e
JOIN Employee m ON e.managerId = m.id
WHERE e.salary > m.salary
ORDER BY e.name;
