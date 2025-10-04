package dsa.binary_tree_general;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Title:  Symmetric Tree (LeetCode 101)   Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/symmetric-tree/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class SymmetricTree {
    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n): n = number of nodes
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }
        return n1.val == n2.val && isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
    }
}
