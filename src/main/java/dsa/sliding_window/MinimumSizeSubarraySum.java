package dsa.sliding_window;

/**
 * Title: Minimum Size Subarray Sum (LeetCode 209)   Topic: Sliding Window   Difficulty: Medium
 * Link: https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */
public class MinimumSizeSubarraySum {
    /**
     * Approach:
     * Must have two pointers
     * add the right pointer to sum until equal or grater than target. When the condition meets move the left pointer ahead
     * Set the result to Math.min(result, i - leftPointer + 1), if the condition meets above
     *
     *
     * <p>
     * Complexity:
     * Sort: Not required
     * Time: O(n)  Space: O(1)
     */
    public int minSubArrayLen(int target, int[] nums) {

        // 2,3,1,2,4,3,7,2,1
        // target: 7
        // output: 1
        int leftPointer = 0;
        int result = nums.length + 1;
        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            while (total >= target) {
                result = Math.min(result, i - leftPointer + 1);
                total -= nums[leftPointer++];
            }
        }

        return result == nums.length + 1 ? 0 : result;
    }
}
