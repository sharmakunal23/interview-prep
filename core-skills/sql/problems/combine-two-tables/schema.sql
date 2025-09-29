-- Delete Table and Indexes if exist
DROP INDEX IF EXISTS idx_person_id;
DROP INDEX IF EXISTS idx_address_person_id;
DROP TABLE IF EXISTS Person;
DROP TABLE IF EXISTS Address;

-- Create Person table with auto-incrementing primary key
CREATE TABLE Person
(
    personId  SERIAL PRIMARY KEY,
    lastName  VARCHAR(255),
    firstName VARCHAR(255)
);

-- Create Address table with auto-incrementing primary key
CREATE TABLE Address
(
    addressId SERIAL PRIMARY KEY,
    personId  INT,
    city      VARCHAR(255),
    state     VARCHAR(255)
);

-- Create indexes for performance testing
CREATE INDEX idx_person_id ON Person (personId);
CREATE INDEX idx_address_person_id ON Address (personId);