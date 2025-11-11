package dsa.binary_tree_general;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Title:  Binary Tree Inorder Traversal (LeetCode 94)  Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();

        inorderTraversalIterativeDFS(root, result);

        return result;
    }

    public void inorderTraversalIterativeDFS(TreeNode root, List<Integer> result) {
        if (root == null) return;
        TreeNode curr = root;

        Stack<TreeNode> stack = new Stack<>();

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
    }

    public void inorderTraversalRecursiveDFS(TreeNode root, List<Integer> result) {
        if (root == null) return;

        inorderTraversalRecursiveDFS(root.left, result);
        result.add(root.val);
        inorderTraversalRecursiveDFS(root.right, result);
    }
}
