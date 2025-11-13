package dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: Subsets II (LeetCode 90)   Topic: Backtracking   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/subsets-ii/description/
 *
 * <p>
 * Problem:
 * Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
 * <p>
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 */
public class SubsetII {
    /**
     * Approach:
     * Base case: Recursion.
     *
     * <p>
     * Complexity:
     * Sort:  O(log(n))
     * Time: O(n!)  Space: O(h): n = number of nodes, h = height of the tree
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            backtrack(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
