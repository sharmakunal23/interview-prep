package dsa.arrays;

/**
 * Title:  String To Integer (LeetCode 8)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/string-to-integer-atoi/
 *
 * <p>
 * Problem:
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Whitespace: Ignore any leading whitespace (" "). <p>
 * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present. <p>
 * Conversion: Read the integer by skipping leading zeros until a non-digit character
 * is encountered or the end of the string is reached. If no digits were read, then the result is 0. <p>
 * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range.
 * Specifically, integers less than -2^31 should be rounded to -2^31, and integers greater than 2^31 - 1 should be rounded to 2^31 - 1.
 */
public class StringToInteger {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Constants for 32-bit signed integer range
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;

        int i = 0;
        int n = s.length();

        // Step 1: Skip leading whitespace
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check if we've reached the end
        if (i == n) {
            return 0;
        }

        // Step 2: Check for sign
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }

        // Step 3: Read digits and convert
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;

            if (sign * res <= INT_MIN) {
                return INT_MIN;
            }
            if (sign * res >= INT_MAX) {
                return INT_MAX;
            }

            i++;
        }

        // Step 4: Apply sign and return
        return (int)(res * sign);
    }
}
