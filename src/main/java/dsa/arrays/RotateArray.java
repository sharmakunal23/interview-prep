package dsa.arrays;

/**
 * Title:  Rotate Array (LeetCode 189)   Topic: Arrays   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        k = (k % size);

        reverseArray(nums, 0, size - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, size - 1);
    }

    private void reverseArray(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }
}
