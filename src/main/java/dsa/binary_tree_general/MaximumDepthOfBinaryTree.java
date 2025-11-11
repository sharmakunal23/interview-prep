package dsa.binary_tree_general;

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

        int maxDepth = 0;

        if (root == null) {
            return maxDepth;
        }

        Stack<Pair> stack = new Stack<>();

        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {
            Pair pair = stack.pop();

            TreeNode node = pair.node;
            int depth = pair.depth;

            if (node != null) {
                maxDepth = Math.max(depth, maxDepth);
                stack.push(new Pair(node.left, depth + 1));
                stack.push(new Pair(node.right, depth + 1));
            }
        }

        return maxDepth;
    }

    private class Pair {
        TreeNode node;
        int depth;

        public Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n): n = number of nodes
     */
    public int maxDepthIterativeBFS(TreeNode root) {

        int count = 0;

        if (root == null) {
            return count;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            count++;
        }

        return count;
    }
}
