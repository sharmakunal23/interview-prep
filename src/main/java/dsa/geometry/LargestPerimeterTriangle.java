package dsa.geometry;

import java.util.Arrays;

/**
 * Title: Largest Perimeter Triangle (LeetCode 976)   Topic: Geometry   Difficulty: Easy
 * Link: https://leetcode.com/problems/largest-perimeter-triangle/
 *
 * <p>
 * Problem:
 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths.
 * If it is impossible to form any triangle of a non-zero area, return 0.
 */
public class LargestPerimeterTriangle {
    /**
     * Approach:
     * Perimeter of a Triangle = a + b + c
     * Triangle Inequality Theorem = sum of the lengths of any two sides of a triangle must be strictly greater than the length of the third side.
     * If this condition holds true for all three combinations of sides, then the lengths can form a triangle <p>
     *
     * For the problem, we first sort the array and in descending order find the first three numbers that forms a triangle.
     *
     * <p>
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(n)  Space: O(1)
     */
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = (nums.length - 1); i>=2; i--) {
            if (canFormTraingle(nums[i-2], nums[i-1], nums[i])) {
                return nums[i-2]+nums[i-1]+nums[i];
            }
        }
        return 0;
    }

    protected boolean canFormTraingle(int a, int b, int c) {
        /**
         * As per Triangle Inequality Theorem: to confirm the sides form a triangle, we should confirm (((a+b) > c) && ((b+c) > a) && ((c+a) > b))
         * Since the array is sorted, taking the following example: 1, 2, 2, we can simply confirm that,
         * if ((a+b) > c), then the other two conditions is also true
         */
        if ((a+b)>c) {
            return true;
        }
        return false;
    }
}
