TRUNCATE Employee;

INSERT INTO Employee (id, name, salary, managerId)
VALUES (1, 'Joe', 70000, 3),
       (2, 'Henry', 80000, 4),
       (3, 'Sam', 60000, NULL),
       (4, 'Max', 90000, NULL);
