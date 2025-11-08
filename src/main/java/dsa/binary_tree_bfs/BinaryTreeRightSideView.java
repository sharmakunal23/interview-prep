package dsa.binary_tree_bfs;

import dsa.binary_tree_general.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Title: Binary Tree Right Side View (LeetCode 199)   Topic: Binary Tree BFS   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/binary-tree-right-side-view/description/
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 */
public class BinaryTreeRightSideView {
    /**
     * Approach: Breadth first search
     * Time Complexity: O(n) - For traversing the entire tree once
     * Space Complexity: O(n) - For using additional data structure
     */
    public List<Integer> rightSideView(TreeNode root) {

        // Initialize a results list
        List<Integer> list = new ArrayList<>();

        // If the root is null than return an empty list
        if (root == null) return list;

        // Initialize a queue
        Deque<TreeNode> queue = new ArrayDeque<>();

        // Add the root node in the queue
        queue.offerFirst(root);

        // while loop until the queue is empty
        while (!queue.isEmpty()) {
            // Initialize an array to store each level
            List<Integer> level = new ArrayList<>();

            int size = queue.size();

            // get the first n nodes from the queue and store thier value in level list
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

            // add the last value from each level for the right side view
            list.add(level.get(size - 1));
        }

        return list;

    }
}
