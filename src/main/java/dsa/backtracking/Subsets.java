package dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Subsets (LeetCode 78)   Topic: Backtracking   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/subsets/description/
 *
 * <p>
 * Problem:
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 */
public class Subsets {
    /**
     * Approach:
     * Base case: Recursion.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n!)  Space: O(h): n = number of nodes, h = height of the tree
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        createSubset(nums, 0, result, subset);
        return result;
    }

    private void createSubset(int[] nums, int index, List<List<Integer>> result, List<Integer> subset) {

        if (index == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        createSubset(nums, index + 1, result, subset);

        subset.remove(subset.size() - 1);
        createSubset(nums, index + 1, result, subset);
    }
}
