package dsa.binary_tree_general;

/**
 * Title:  Path Sum (LeetCode 102)   Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/path-sum/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals targetSum.
 * <p>
 * A leaf is a node with no children.
 */
public class PathSum {
    /**
     * Approach:
     * Inorder DFS
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n)
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }

    private boolean dfs(TreeNode node, int count, int targetSum) {
        if (node == null) {
            return false;
        }

        count += node.val;

        if (node.left == null && node.right == null) {
            if (count == targetSum) {
                return true;
            }
        }

        return dfs(node.left, count, targetSum) || dfs(node.right, count, targetSum);
    }
}
