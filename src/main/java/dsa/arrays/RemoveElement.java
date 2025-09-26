package dsa.arrays;

import java.util.Arrays;

/**
 * Title: Remove Element (LeetCode 27)   Topic: arrays   Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
 * Then return the number of elements in nums which are not equal to val.
 */
public class RemoveElement {

    /**
     * Approach:
     * Replace each element that equals val with a number higher number than provided in constraints,
     * Count otherwise . Sort the Array and return the count
     *
     * <p>
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(n)  Space: O(n)
     */
    public int bruteForceRemoveElement(int[] nums, int val) {

        int countElement = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 51; // max value can't exceed 50 so set it to higher and sort after
            } else  {
                countElement++;
            }
        }
        Arrays.sort(nums);
        return countElement;
    }

    /**
     * Approach:
     * The problem says it doesn't matter what lies in the array after nums[k]
     * If the nums[i] equals val then continue, otherwise swap
     * Idea is to bring the elements in the front that doesn't match val
     *
     * <p>
     * Complexity:
     * Sort: Not required
     * Time: O(n)  Space: O(1)
     */
    public int optimizedRemoveElement(int[] nums, int val) {

        // 3,3,3,3,4,5,3
        // 00,01,02,03,14,25,26
        int countElement = 0;
        int start = 0;
        int end = nums.length;

        while (start < end) {
            if (nums[start] == val) {
                start++;
            } else {
                nums[countElement] = nums[start];
                countElement++;
                start++;
            }
        }
        return countElement;
    }

}
