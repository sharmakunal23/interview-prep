package dsa.math;

/**
 * Title: Add Binary (LeetCode 67)   Topic: Bit Manipulation   Difficulty: Easy
 * Link: https://leetcode.com/problems/add-binary/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given two binary strings a and b, return their sum as a binary string.
 */
public class PalindromeNumber {

    /**
     * Approach:
     * Convert to String, and compare letters
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n)
     */
    public boolean isPalindromeBruteForce(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        return isPalindrome(s);
    }

    private boolean isPalindrome(String x) {
        int size = x.length();
        int left = 0;
        int right = size - 1;

        while (left < right) {
            if (x.charAt(left) == x.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Approach:
     * Reverse number
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public boolean isPalindromeOptimized(int x) {
        if(x < 0) return false;
        int reverse = 0;
        int number = x;

        while (number != 0) {
            reverse = (reverse * 10) + (number % 10);
            number = number / 10;
        }

        return reverse == x;
    }
}
