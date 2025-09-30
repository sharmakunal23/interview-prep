package dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Contains Duplicate II (LeetCode 219)   Topic: Hashmap   Difficulty: Easy
 * Link: https://leetcode.com/problems/contains-duplicate-ii/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an integer array nums and an integer k, return true if there are
 * two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 *
 */
public class ContainsDuplicateII {
    /**
     * Approach:
     * Store number and it's indexes in a Hashmap as we iterate through.
     * If the number already exist then check of abs(i-j) <= k, otherwise add/update the hashMap
     *
     * <p>
     * Complexity:
     * Sort: None
     * Time: O(n)  Space: O(n)
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
