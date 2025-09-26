package dsa.arrays;

import java.util.Arrays;

/**
 * Title: Merge Sorted Array (LeetCode 88)   Topic: arrays   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150 <p>
 *
 * Problem:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively. <p>
 * - Merge nums1 and nums2 into a single array sorted in non-decreasing order. <p>
 * - The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n. <p>
 *
 */
public class MergeSortArray {

    /**
     * Approach:
     * We know num1 always will have enough space for to merge nums 2, so we start adding numbers from nums2 after from index m in nums1.
     * After all the numbers are added we sort the array. <p>
     *
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(m + n)  Space: O(n)
     */
    public void bruteForceMerge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                nums1[i + m] = nums2[i];
            }
            Arrays.sort(nums1);
        }
    }

    /**
     * Approach:
     * Start form the last element in the nums1 and go backwards until n = 0.
     * For each iteration we compare the non-zero values and store the greater value in nums1<p>
     *
     * Complexity:
     * Sort: Not required
     * Time: O(m + n)  Space: O(1)
     */
    public void optimizedMerge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n - 1;
        while (m > 0 && n > 0) {
            if (nums1[m-1] > nums2[n-1]) {
                nums1[size] = nums1[m-1];
                m--;
            }else  {
                nums1[size] = nums2[n-1];
                n--;
            }
            size--;
        }
        while (n > 0) {
            nums1[size] = nums2[n-1];
            n--;
            size--;
        }
    }
}
