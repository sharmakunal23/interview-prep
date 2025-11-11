package dsa.binary_tree_bfs;

import dsa.binary_tree_general.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Title: Minimum Depth of Binary Tree (LeetCode 111)   Topic: Binary Tree BFS   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 *
 * <p>
 * Problem:
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * <p>
 * Note: A leaf is a node with no children.
 */
public class MinimumDepthOfABinaryTree {
    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0 || right == 0) {
            return Math.max(left, right) + 1;
        }

        return Math.min(left, right) + 1;

    }

    public int minDepthIterativeBFS(TreeNode root) {

        int count = 0;

        if (root == null) return count;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        count++;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left == null && node.right == null) {
                    return count;
                }

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
