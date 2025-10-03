package dsa.binary_tree_general;

import org.apache.commons.math3.util.Pair;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Title:  Maximum Depth of Binary Tree (LeetCode 104)   Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthOfBinaryTree {
    /**
     * Approach:
     * Base case: root == null, return null, or else recursively add 1 at each level.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(h): n = number of nodes, h = height of the tree
     */
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n): n = number of nodes
     */
    public int maxDepthIterativeDFS(TreeNode root) {
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair<>(root, 1));
        int maxDepth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> pair = stack.pop();
            TreeNode node = pair.getKey();
            int depth = pair.getValue();
            if (node != null) {
                maxDepth = Math.max(maxDepth, depth);
                stack.push(new Pair<>(node.left, depth + 1));
                stack.push(new Pair<>(node.right, depth + 1));
            }
        }
        return maxDepth;
    }

    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n): n = number of nodes
     */
    public int maxDepthIterativeBFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            maxDepth++;
        }
        return maxDepth;
    }
}
