package dsa.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * Title:  Climbing Stairs (LeetCode 70)   Topic: Dynamic Programming   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/climbing-stairs/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * You are climbing a staircase. It takes n steps to reach the top. <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {
    /**
     * Approach:
     * The number of distinct way to climb n stairs is equal to (n-1) + (n-2)
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int previous  = 1;
        int current = 2;
        for (int i = 2; i < n; i++) {
            int temp = current + previous;
            previous = current;
            current = temp;
        }

        return current;
    }

    /**
     * Approach:
     * The number of distinct way to climb n stairs is equal to (n-1) + (n-2), get the results recursive with top-down approach.
     * Map helps to cache values that is already calculated
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n)
     */
    public int climbStairsMemoization(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        return climbStairsMemoization(n, map);
    }

    private int climbStairsMemoization(int n, Map<Integer, Integer> map) {
        if (n <= 1) {
            return 1;
        }
        if  (!map.containsKey(n)) {
            map.put(n, climbStairsMemoization(n - 1, map) + climbStairsMemoization(n - 2, map));
        }
        return map.get(n);
    }
}
