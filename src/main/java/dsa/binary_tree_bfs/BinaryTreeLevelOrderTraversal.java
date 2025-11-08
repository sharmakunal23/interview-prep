package dsa.binary_tree_bfs;

import dsa.binary_tree_general.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Title: Binary Tree Level Order Traversal (LeetCode 102)   Topic: Binary Tree BFS   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
public class BinaryTreeLevelOrderTraversal {
    /**
     * Approach: Breadth first search
     * Time Complexity: O(n) - For traversing the entire tree once
     * Space Complexity: O(n) - For using additional data structure
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Initialize a list to stor results
        List<List<Integer>> list = new ArrayList<>();

        // If the root is null than return an emply list
        if (root == null) return list;

        // Initialize a Queue to store TreeNode
        Deque<TreeNode> queue = new ArrayDeque<>();

        // Add the root in queue
        queue.offerLast(root);

        // While Loop until the queue is empty
        while (!queue.isEmpty()) {
            // Create a list to store values at each level
            List<Integer> level = new ArrayList<>();

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                level.add(node.val);

                if (node.left != null) {
                    queue.offerLast(node.left);
                }

                if (node.right != null) {
                    queue.offerLast(node.right);
                }
            }
            list.add(level);
        }
        return list;
    }
}
