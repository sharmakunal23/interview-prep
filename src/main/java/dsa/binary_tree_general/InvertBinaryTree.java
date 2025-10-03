package dsa.binary_tree_general;

/**
 * Title:  Invert Binary Tree (LeetCode 226)   Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/invert-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {
    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n): n = number of nodes
     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
