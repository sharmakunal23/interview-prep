package dsa.hashmap;

import java.util.Arrays;

/**
 * Title: Valid Anagram (LeetCode 242)   Topic: Hashmap   Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-anagram/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 */
public class ValidAnagram {
    /**
     * Approach:
     * Sort both Strings by character and compare
     *
     * <p>
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(n)  Space: O(n)
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return (Arrays.equals(sChar, tChar));
    }
}
