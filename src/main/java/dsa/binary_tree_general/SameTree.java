package dsa.binary_tree_general;

/**
 * Title:  Same Tree (LeetCode 100)   Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/same-tree/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
public class SameTree {
    /**
     * Approach:
     * Base case: root == null, return null, or else recursively add 1 at each level.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(h): n = number of nodes, h = height of the tree
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || q.val != p.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
