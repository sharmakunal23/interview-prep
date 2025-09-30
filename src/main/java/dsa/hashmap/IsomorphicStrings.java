package dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Isomorphic Strings (LeetCode 205)   Topic: HashMap   Difficulty: Easy
 * Link: https://leetcode.com/problems/isomorphic-strings/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given two strings s and t, determine if they are isomorphic. <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t. <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 */
public class IsomorphicStrings {
    /**
     * Approach:
     * Map each character from s.charAt(i) to t.charAt(t)
     * if the character exist in the mapping, then check it is the same as previous,
     * otherwise check if t.charAt(t) doesn't already exist in values and create a new mapping.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n)
     */
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mapping.containsKey(s.charAt(i))) {
                if (mapping.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (mapping.containsValue(t.charAt(i))) {
                    return false;
                }
                mapping.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
