package dsa.binary_tree_general;

/**
 * Title:  Count Good Nodes in Binary Tree (LeetCode 1448)   Topic: Binary Tree General   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/
 *
 * <p>
 * Problem:
 * Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
 * <p>
 * Return the number of good nodes in the binary tree.
 */
public class CountGoodNodesInABinarySearchTree {
    public int goodNodes(TreeNode root) {

        return preOrderDFS(root, root.val);

    }

    private int preOrderDFS(TreeNode node, int max) {
        if (node == null) return 0;

        int result = node.val >= max ? 1 : 0;
        max = Math.max(max, node.val);

        result += preOrderDFS(node.left, max);
        result += preOrderDFS(node.right, max);

        return result;
    }
}
