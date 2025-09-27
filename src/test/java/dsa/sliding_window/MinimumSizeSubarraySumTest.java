package dsa.sliding_window;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Title: Minimum Size Subarray Sum (LeetCode 209)   Topic: Sliding Window   Difficulty: Medium
 * Link: https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 */
class MinimumSizeSubarraySumTest {
    private MinimumSizeSubarraySum minimumSizeSubarraySum;

    @BeforeEach
    void setUp() {
        minimumSizeSubarraySum = new MinimumSizeSubarraySum();
    }

    @AfterEach
    void tearDown() {
        minimumSizeSubarraySum = null;
    }

    @Test
    void minSubArrayLen() {
        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        Assertions.assertEquals(2, minimumSizeSubarraySum.minSubArrayLen(target, nums));

        target = 4;
        nums = new int[]{1, 4, 3, 2, 5};
        Assertions.assertEquals(1, minimumSizeSubarraySum.minSubArrayLen(target, nums));

        target = 11;
        nums = new int[]{1, 1, 1, 1, 1};
        Assertions.assertEquals(0, minimumSizeSubarraySum.minSubArrayLen(target, nums));
    }
}