package dsa.arrays;

/**
 * Title:  Find Minimum in Rotated Sorted Array (LeetCode 153)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
 *
 * <p>
 * Problem:
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class FindMinimumInRotatedSortedArray {
    /**
     1. left = 0, right = nums.length - 1, mid = left + ((right - left) / 2)
     2. keep track of the lowest value of mid until left == right
     2. if mid < nums[left] -> right = mid - 1, else left = mid + 1
     */
    public int findMin(int[] nums) {

        int left = 0, right = nums.length - 1;
        int min = nums[0];

        while (left <= right) {
            // list already sorted
            if (nums[left] <= nums[right]) {
                min = Math.min(min, nums[left]);
                break;
            }

            int mid = left + ((right - left) / 2);

            // left half sorted
            if (nums[left] <= nums[mid]) {
                min = Math.min(min, nums[left]);
                left = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                right = mid - 1;
            }
        }
        return min;
    }
}
