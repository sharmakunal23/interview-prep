package dsa.hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * Title: Happy Number (LeetCode 202)   Topic: Hashmap   Difficulty: Easy
 * Link: https://leetcode.com/problems/happy-number/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Write an algorithm to determine if a number n is happy. <p>
 * A happy number is a number defined by the following process: <p>
 *
 * - Starting with any positive integer, replace the number by the sum of the squares of its digits. <p>
 * - Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. <p>
 * - Those numbers for which this process ends in 1 are happy.
 *
 */
public class HappyNumber {
    /**
     * Approach:
     * Get the sum of squared numbers until we either find 1 or a cycle with number that consist in the hashset.
     *
     * <p>
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(n)  Space: O(n)
     */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int happy = n;
        while (happy != 1) {
            happy = sumOfSquaresOfEachDigitInNumber(happy);
            if (set.contains(happy)) {
                return false;
            } else {
                set.add(happy);
            }
        }
        return true;
    }

    private int sumOfSquaresOfEachDigitInNumber(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += (numberSquare(digit));
            n /= 10;
        }
        return sum;
    }

    private int numberSquare(int n) {
        return n * n;
    }
}
