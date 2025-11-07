package dsa.two_pointers;

/**
 * Title: Two Sum II - With Input Array Is Sorted (LeetCode 167)   Topic: Two Pointers   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * <p>
 * Problem:
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests a regenerated such that there is exactly one solution. You may not use the same element twice.
 * <p>
 * Your solution must use only constant extra space.
 */
public class TwoSumIIWithInputArrayIsSorted {
    /**
     1. Create a left pointer and a right pointer
     2. while left < right: if numbers[left] + numbers[right] == target than return left++, right++
     3. if target is smaller than move right or else move left
     */
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }
}
