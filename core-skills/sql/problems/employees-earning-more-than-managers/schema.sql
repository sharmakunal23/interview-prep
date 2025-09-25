DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee (
  id INT PRIMARY KEY,
  name TEXT NOT NULL,
  salary INT NOT NULL,
  managerId INT NULL REFERENCES Employee(id)
);
