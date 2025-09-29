-- Simple scale test with 1 million records
-- Clear existing data
TRUNCATE Person;
TRUNCATE Address;

-- Generate 1,000,000 Person records with random 8-letter names
INSERT INTO Person (firstName, lastName)
SELECT substring(md5(random()::text), 1, 8) as firstName,
       substring(md5(random()::text), 1, 8) as lastName
FROM generate_series(1, 1000000);

-- Generate addresses for 70% of people
INSERT INTO Address (personId, city, state)
SELECT personId,
       concat('City', personId)  as city,
       concat('State', personId) as state
FROM Person
WHERE personId % 10 < 7;

-- Add some addresses for non-existent people
INSERT INTO Address (personId, city, state)
SELECT 1000000 + s                  as personId,
       concat('City', 1000000 + s)  as city,
       concat('State', 1000000 + s) as state
FROM generate_series(1, 1000) s;

-- Show statistics
SELECT 'Person records' as info, COUNT(*) as count
FROM Person
UNION ALL
SELECT 'Address records' as info, COUNT(*) as count
FROM Address
UNION ALL
SELECT 'People with addresses' as info, COUNT(*) as count
FROM Person p
         JOIN Address a ON p.personId = a.personId
UNION ALL
SELECT 'People without addresses' as info, COUNT(*) as count
FROM Person p
         LEFT JOIN Address a ON p.personId = a.personId
WHERE a.personId IS NULL;