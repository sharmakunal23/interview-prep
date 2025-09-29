-- This script removes all data and tables created for the LeetCode problem if exists

DROP INDEX IF EXISTS idx_person_id;
DROP INDEX IF EXISTS idx_address_person_id;
DROP TABLE IF EXISTS Person;
DROP TABLE IF EXISTS Address;