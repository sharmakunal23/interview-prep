package dsa.intervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Summary Ranges (LeetCode 228)   Topic: Intervals   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/summary-ranges/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * You are given a sorted unique integer array nums. <p>
 * A range [a,b] is the set of all integers from a to b (inclusive). <p>
 *
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges,
 * and there is no integer x such that x is in one of the ranges but not in nums.
 */
public class SummaryRanges {
    /**
     * Complexity:
     * Sort: None
     * Time: O(n)  Space: O(n)
     */
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList(0);
        }

        List<String> range = new ArrayList();
        int start = nums[0];
        int previous = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == previous) {
                previous = nums[i];
            } else {
                if (start == previous) {
                    range.add(String.valueOf(start));
                } else {
                    range.add(start + "->" + previous);
                }
                start = nums[i];
                previous = nums[i];
            }
        }
        if (start == previous) {
            range.add(String.valueOf(start));
        } else {
            range.add(start + "->" + previous);
        }
        return range;
    }
}
