package dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: Permutations (LeetCode 46)   Topic: Backtracking   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/permutations/description/
 *
 * <p>
 * Problem:
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 */
public class Permutations {
    /**
     * Approach:
     * Base case: Recursion.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n!)  Space: O(h): n = number of nodes, h = height of the tree
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        backtrack(nums, current, used, result);

        return result;
    }

    private void backtrack(
            int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result
    )
    {
        // Base case: permutation is complete
        if (current.size() == nums.length) {
            // Add a copy of current when the condition is met
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each number that hasn't been used
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            // Make choice
            current.add(nums[i]);
            used[i] = true;

            // Recurse
            backtrack(nums, current, used, result);

            // Undo choice
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}
