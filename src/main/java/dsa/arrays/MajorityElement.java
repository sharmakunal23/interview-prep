package dsa.arrays;

import java.util.Arrays;

/**
 * Title: Majority Element (LeetCode 169)   Topic: Array   Difficulty: Easy
 * Link: https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
public class MajorityElement {
    /**
     * Approach:
     * Sort the array count until one of the element's count is more than n/2.
     *
     * <p>
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(n)  Space: O(1)
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int size = nums.length;
        for (int i = 1; i < size; i++) {
            if (nums[i] == nums[i-1]) {
                count++;
                if (count > (size / 2)) {
                    return nums[i];
                }
            } else {
                count = 1;
            }
        }
        return nums[0];
    }
}
