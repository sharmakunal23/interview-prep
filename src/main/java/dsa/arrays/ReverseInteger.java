package dsa.arrays;

/**
 * Title:  Reverse Integer (LeetCode 7)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/reverse-integer/description/
 *
 * <p>
 * Problem:
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * <b>Assume the environment does not allow you to store 64-bit integers (signed or unsigned).</>
 */
public class ReverseInteger {
    /**
        Approach:
        - Uses mathematical digit extraction with modulo and division operations to reverse the integer.
        - Performs explicit overflow checks before each update to prevent 32-bit integer overflow.
        - Time complexity: O(log₁₀|x|) where |x| is the absolute value of input (proportional to number of digits).
        - Space complexity: O(1) using only a constant amount of extra space.
     */
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return reversed;
    }
}
