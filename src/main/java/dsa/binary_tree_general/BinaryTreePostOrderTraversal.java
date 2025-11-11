package dsa.binary_tree_general;

import java.util.ArrayList;
import java.util.List;

/**
 * Title:  Binary Tree Postorder Traversal (LeetCode 145)  Topic: Binary Tree General   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/binary-tree-postorder-traversal/
 *
 * <p>
 * Problem:
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 */
public class BinaryTreePostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        postorderTraversalRecursiveDFS(root, result);

        return result;

    }

    private void postorderTraversalRecursiveDFS(TreeNode root, List<Integer> result) {
        if (root == null) return;

        postorderTraversalRecursiveDFS(root.left, result);
        postorderTraversalRecursiveDFS(root.right, result);

        result.add(root.val);
    }
}
