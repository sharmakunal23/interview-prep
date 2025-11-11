package dsa.binary_tree_general;

/**
 * Title:  Balanced Binary Tree (LeetCode 110)  Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/balanced-binary-tree/description/
 *
 * <p>
 * Problem:
 * Given a binary tree, determine if it is height-balanced.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return checkDepth(root) != -1;
    }

    private int checkDepth(TreeNode node) {

        if (node == null) return 0;

        int leftDepth = checkDepth(node.left);
        if (leftDepth == -1) {
            return -1;
        }

        int rightDepth = checkDepth(node.right);
        if (rightDepth == -1) {
            return -1;
        }

        if (Math.abs(leftDepth - rightDepth) > 1) {
            return -1;
        }

        return Math.max(leftDepth, rightDepth) + 1;

    }
}
