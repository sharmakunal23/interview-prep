package dsa.binary_tree_general;

/**
 * Title:  Validate Binary Search Tree (LeetCode 98)   Topic: Binary Tree General   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/validate-binary-search-tree/description/
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
 * <p>
 * A valid BST is defined as follows:
 * <p>
 * - The left subtree of a node contains only nodes with keys strictly less than the node's key. <p>
 * - The right subtree of a node contains only nodes with keys strictly greater than the node's key. <p>
 * - Both the left and right subtrees must also be binary search trees.
 */
public class ValidateBinarySearchTree {
    /**
     * Approach: Depth first search
     * Time Complexity: O(n) - For traversing the entire tree once
     * Space Complexity: O(n) - For recursive solution
     */
    public boolean isValidBST(TreeNode root) {

        long left = Long.MIN_VALUE;
        long right = Long.MAX_VALUE;

        return valid(root, left, right);

    }

    private boolean valid(TreeNode node, long left, long right) {
        if (node == null) return true;

        if (!(node.val > left && node.val < right)) return false;

        return valid(node.left, left, node.val) && valid(node.right, node.val, right);
    }
}
