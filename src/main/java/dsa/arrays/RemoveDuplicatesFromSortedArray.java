package dsa.arrays;

import java.util.Arrays;

/**
 * Title: Remove Duplicates from Sorted Array (LeetCode 26)   Topic: arrays   Difficulty: Easy
 * Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 */
public class RemoveDuplicatesFromSortedArray {

    /**
     * Approach:
     * Start with index 1, since the problem states there will be at least 1 element in the array.
     * Replace each element that equals the previous element with a number higher number than provided in constraints,
     * Count otherwise . Sort the Array and return the count
     *
     * <p>
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(n)  Space: O(n)
     */
    public int bruteForceRemoveDuplicates(int[] nums) {
        // [0,0,1,1,1,2,2,3,3,4]
        // 1 <= nums.length <= 3 * 104
        // -100 <= nums[i] <= 100
        int countElements = 1;
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = 101;
            } else  {
                val = nums[i];
                countElements++;
            }
        }
        Arrays.sort(nums);
        return countElements;
    }

    /**
     * Approach:
     * The problem says it doesn't matter what lies in the array after nums[k]
     * If the nums[i] equals previous then continue, otherwise swap with nums[countElements],
     * countElements is the left pointer in the array to track count of elements that are unique
     * Idea is to bring the unique elements in the front
     *
     * <p>
     * Complexity:
     * Sort: Not required
     * Time: O(n)  Space: O(1)
     */
    public int optimizedRemoveDuplicates(int[] nums) {
        // [0,0,1,1,1,2,2,3,3,4]
        // [0,1,2,3,4,_,_,_,_,_]
        // [00,11,12,23,24,25,36,47,48...]
        int countElements = 1;
        int start = 1;
        int end = nums.length;
        while (start < end) {
            if (nums[start] == nums[start-1]) {
                start++;
            } else {
                nums[countElements] = nums[start];
                countElements++;
                start++;
            }
        }
        return countElements;
    }
}
