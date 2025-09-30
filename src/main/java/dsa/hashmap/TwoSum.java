package dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Two Sum (LeetCode 1)   Topic: Hashmap   Difficulty: Easy
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
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                return new int[] {map.get(nums[i]), i};
            } else {
                map.put((target - nums[i]), i);
            }
        }
        throw new IllegalArgumentException("No solution");
    }

}
