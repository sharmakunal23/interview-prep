package dsa.arrays;

/**
 * Title:  Search a 2D Matrix II (LeetCode 240)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 *
 * <p>
 * Problem:
 * Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties: <p>
 * Integers in each row are sorted in ascending from left to right. <p>
 * Integers in each column are sorted in ascending from top to bottom.
 */
public class SearchA2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) return false;

        int innerMaxIndex = matrix[0].length - 1;
        int index = -1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] > target || matrix[i][innerMaxIndex] < target) {
                // if the target is less tha the minimum value in the array
                // or grater than the maximum value than no need to searh in the array
                continue;
            }
            index = binarySearch(matrix[i], target);
            if (index != -1) {
                return true;
            }
        }
        return false;
    }

    private int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
