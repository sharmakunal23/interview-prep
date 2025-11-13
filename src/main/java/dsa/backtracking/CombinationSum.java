package dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: Combination Sum (LeetCode 39)   Topic: Backtracking   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/combination-sum/description/
 *
 * <p>
 * Problem:
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 * <p>
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * <p>
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */
public class CombinationSum {
    /**
     * Approach:
     * Base case: Recursion.
     *
     * <p>
     * Complexity:
     * Sort: O(nlog(n))
     * Time: O(n!)  Space: O(h): n = number of nodes, h = height of the tree
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Enable pruning
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remaining, int start,
                           List<Integer> current, List<List<Integer>> result) {
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Pruning: if current number exceeds remaining, stop
            if (candidates[i] > remaining) break;

            current.add(candidates[i]);
            // Can reuse same element, so pass 'i' not 'i+1'
            backtrack(candidates, remaining - candidates[i], i, current, result);
            current.remove(current.size() - 1);
        }
    }
}
