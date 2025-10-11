package dsa.arrays;

/**
 * Title: Find the Index of the First Occurrence in a String (LeetCode 28)   Topic: arrays   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150 <p>
 *
 * Problem:
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class FindIndexOfTheFirstOccurrenceInAString {
    /**
     * Approach:
     * Sliding Window approach <p>
     *
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public int strStr(String haystack, String needle) {
        int nSize = needle.length();
        int hSize = haystack.length();

        for(int i = 0, j = nSize; j<=hSize; i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
