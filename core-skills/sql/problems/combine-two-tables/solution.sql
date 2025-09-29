/*
Title: Combine Two Tables (LC 175)
Link: https://leetcode.com/problems/combine-two-tables/description/?envType=problem-list-v2&envId=database&
Approach: LEFT JOIN to preserve all Person records, including those without addresses
Complexity: O(n + m) hash join; indexes ineffective for full table LEFT JOIN, since most rows were returned back from both Person and Address
*/

SELECT p.firstName, p.lastName, a.city, a.state
FROM Person p
         LEFT JOIN Address a ON p.personId = a.personId
