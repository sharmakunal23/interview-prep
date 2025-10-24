package dsa.arrays;

/**
 * Title:  Search a 2D Matrix (LeetCode 74)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/search-a-2d-matrix/description/
 *
 * <p>
 * Problem:
 * You are given an m x n integer matrix matrix with the following two properties:
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 */
public class SearchA2DMatrix {
    /**
     * Approach:
     * Divide and Conquer
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(log n * m)  Space: O(1)
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int index = binarySearchArray(matrix, target);
        if (index > -1) {
            index = binarySearch(matrix[index], target);
        }
        return index != -1;
    }

    private int binarySearchArray(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;
        int innerMaxIndex = matrix[0].length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (matrix[mid][0] <= target && matrix[mid][innerMaxIndex] >= target) {
                return mid;
            } else if (matrix[mid][0] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    private int binarySearch(int[] nums, int target) {
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
