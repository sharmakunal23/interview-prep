package dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Title: Combination Sum II (LeetCode 40)   Topic: Backtracking   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/combination-sum-ii/description/
 *
 * <p>
 * Problem:
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
 * <p>
 * Each number in candidates may only be used once in the combination.
 * <p>
 * Note: The solution set must not contain duplicate combinations.
 */
public class CombinationSumII {
    /**
     * Approach:
     * Base case: Recursion.
     *
     * <p>
     * Complexity:
     * Sort: O(nlog(n))
     * Time: O(n!)  Space: O(h): n = number of nodes, h = height of the tree
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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

            // To avoid duplicates
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }

            current.add(candidates[i]);

            // To use the next element, pass 'i+1'
            backtrack(candidates, remaining - candidates[i], i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }
}
