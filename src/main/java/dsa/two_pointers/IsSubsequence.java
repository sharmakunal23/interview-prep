package dsa.two_pointers;

/**
 * Title: Is Subsequence (LeetCode 392)   Topic: Two Pointers   Difficulty: Easy
 * Link: https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise. <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
 * of the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
public class IsSubsequence {

    /**
     * Approach:
     * Must have two pointers starting from the start of each String
     * if the character in s.charAt(slowPointer) == t.charAt(fastPointer, increment both or else just the fast pointer.
     * the slowPointer should equal to s.length(), that confirms s is a subsequence of t.
     *
     *
     * <p>
     * Complexity:
     * Sort: Not required
     * Time: O(n)  Space: O(1)
     */
    public boolean isSubsequence(String s, String t) {
        // "abc"
        // "ahbgdc"
        int slowPointer = 0;
        int fastPointer = 0;

        while (slowPointer < s.length() && fastPointer < t.length()) {
            if (s.charAt(slowPointer) == t.charAt(fastPointer)) {
                slowPointer++;
                fastPointer++;
            } else {
                fastPointer++;
            }
        }

        return slowPointer == s.length();
    }
}
