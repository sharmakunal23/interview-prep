DROP TABLE IF EXISTS Person;
DROP TABLE IF EXISTS Address;

-- Insert sample data into Person table (25+ records)
INSERT INTO Person (personId, lastName, firstName)
VALUES (1, 'Wang', 'Allen'),
       (2, 'Alice', 'Bob'),
       (3, 'Johnson', 'Charlie'),
       (4, 'Smith', 'Diana'),
       (5, 'Brown', 'Emma'),
       (6, 'Davis', 'Frank'),
       (7, 'Wilson', 'Grace'),
       (8, 'Miller', 'Henry'),
       (9, 'Moore', 'Isabella'),
       (10, 'Taylor', 'Jack'),
       (11, 'Anderson', 'Kate'),
       (12, 'Thomas', 'Liam'),
       (13, 'Jackson', 'Mia'),
       (14, 'White', 'Noah'),
       (15, 'Harris', 'Olivia'),
       (16, 'Martin', 'Peter'),
       (17, 'Thompson', 'Quinn'),
       (18, 'Garcia', 'Rachel'),
       (19, 'Martinez', 'Sam'),
       (20, 'Robinson', 'Tina'),
       (21, 'Clark', 'Uma'),
       (22, 'Rodriguez', 'Victor'),
       (23, 'Lewis', 'Wendy'),
       (24, 'Lee', 'Xavier'),
       (25, 'Walker', 'Yara'),
       (26, 'Hall', 'Zoe'),
       (27, 'Allen', 'Adam'),
       (28, 'Young', 'Bella'),
       (29, 'Hernandez', 'Carlos'),
       (30, 'King', 'Delta');

-- Insert sample data into Address table
-- Note: Some people have addresses, some don't (to test NULL handling)
INSERT INTO Address (addressId, personId, city, state)
VALUES (1, 2, 'New York City', 'New York'),
       (2, 3, 'Los Angeles', 'California'),
       (3, 5, 'Chicago', 'Illinois'),
       (4, 7, 'Houston', 'Texas'),
       (5, 8, 'Phoenix', 'Arizona'),
       (6, 10, 'Philadelphia', 'Pennsylvania'),
       (7, 12, 'San Antonio', 'Texas'),
       (8, 14, 'San Diego', 'California'),
       (9, 15, 'Dallas', 'Texas'),
       (10, 17, 'San Jose', 'California'),
       (11, 19, 'Austin', 'Texas'),
       (12, 21, 'Jacksonville', 'Florida'),
       (13, 23, 'Fort Worth', 'Texas'),
       (14, 25, 'Columbus', 'Ohio'),
       (15, 27, 'Charlotte', 'North Carolina'),
       (16, 29, 'San Francisco', 'California'),
-- Some addresses for people who don't exist in Person table
       (17, 35, 'Seattle', 'Washington'),
       (18, 40, 'Denver', 'Colorado'),
       (19, 45, 'Boston', 'Massachusetts'),
       (20, 50, 'Nashville', 'Tennessee');
