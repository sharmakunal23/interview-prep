package dsa.binary_tree_general;

/**
 * Title: Count Complete Tree Nodes (LeetCode 222)   Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/count-complete-tree-nodes/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * <p>
 * According to Wikipedia, every level, except possibly the last, is completely filled in a
 * complete binary tree, and all nodes in the last level are as far left as possible.
 * It can have between 1 and 2h nodes inclusive at the last level h.
 * <p>
 * Design an algorithm that runs in less than O(n) time complexity.
 */
public class CountCompleteTreeNodes {
    /**
     * Approach:
     * DFS
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n)
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
