package dsa.binary_tree_general;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Title:  Binary Tree Preorder Traversal (LeetCode 144)  Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/binary-tree-postorder-traversal/
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */
public class BinaryTreePreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        preorderTraversalRecursiveDFS(root, list);

        return list;
    }

    private void preorderTraversalRecursiveDFS(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderTraversalRecursiveDFS(root.left, result);
        preorderTraversalRecursiveDFS(root.right, result);
    }


    public List<Integer> preorderTraversalIterativeDFS(TreeNode root, List<Integer> result) {

        if (root == null) return result;

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val);

            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }

        return result;
    }
}
