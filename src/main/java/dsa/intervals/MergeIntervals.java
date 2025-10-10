package dsa.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: Merge Intervals (LeetCode 56)   Topic: Intervals   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/merge-intervals/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given an array of intervals where intervals[i] = [starti, endi],
 * merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 */
public class MergeIntervals {
    /**
     * Complexity:
     * Sort: O(n log(n))
     * Time: O(n)  Space: O(n)
     */
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[][] result = new int[intervals.length][];
        int index = 0;
        int[] start = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= start[1]) {
                if (intervals[i][1] > start[1]) {
                    start[1] = intervals[i][1];
                }
            } else {
                result[index++] = start;
                start = intervals[i];
            }
        }
        result[index++] = start;
        return Arrays.copyOf(result, index);
    }

    // Link: https://www.hackerrank.com/contests/software-engineer-prep-kit/challenges/merge-and-sort-intervals/problem?isFullScreen=true
    public static List<List<Integer>> mergeHighDefinitionIntervals(List<List<Integer>> intervals) {
        // Write your code here
        if (intervals.isEmpty()) {
            return intervals;
        }
        intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        int size = intervals.size();
        List<List<Integer>> merged = new ArrayList<>(size);

        int index = 0;
        List<Integer> start = intervals.get(0);

        for  (int i = 1; i < size; i++) {
            if (intervals.get(i).get(0) <= start.get(1)) {
                if (intervals.get(i).get(1) > start.get(1)) {
                    start.set(1, intervals.get(i).get(1));
                }
            } else {
                merged.add(start);
                start = intervals.get(i);
            }
        }
        merged.add(start);
        return merged;
    }
}
