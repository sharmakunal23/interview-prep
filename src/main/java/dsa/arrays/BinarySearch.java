package dsa.arrays;

/**
 * Title:  Binary Search (LeetCode 704)   Topic: Array   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/binary-search/description/
 *
 * <p>
 * Problem:
 * Given an array of integers nums which is sorted in ascending order, and an integer target, <p>
 * write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 */
public class BinarySearch {

    /**
     * Approach:
     * Divide and Conquer
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(log n)  Space: O(1)
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right -  left / 2);

            if (nums[mid] == target) return mid;

            else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
