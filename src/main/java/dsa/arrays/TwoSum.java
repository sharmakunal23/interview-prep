package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Two Sum (LeetCode 1)   Topic: arrays   Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 *
 * <p>
 * Problem:
 * Given nums[] and target, return indices i,j such that nums[i] + nums[j] = target.
 * Exactly one solution. Do not reuse the same element twice.
 *
 */
public class TwoSum {

    /**
     * Approach:
     * HashMap value->index. For each x at i, check if (target - x) exists; if yes, return pair.
     * Insert x after check to avoid using the same index twice.
     *
     * <p>
     * Complexity:
     * Time: O(n)  Space: O(n)
     */
    public int[] hashMapSolution(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("nums must have length >= 2");
        }
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            Integer j = seen.get(need);
            if (j != null) {
                return new int[]{j, i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

}
