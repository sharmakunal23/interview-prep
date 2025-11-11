package dsa.binary_tree_general;

/**
 * Title:  Diameter of Binary Tree (LeetCode 543   Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/diameter-of-binary-tree/description/
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * <p>
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
 * <p>
 * The length of a path between two nodes is represented by the number of edges between them.
 */
public class DiameterOfABinaryTree {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        maxDepth(root);
        return diameter;

    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);

    }
}
