package dsa.binary_tree_general;

import java.util.Arrays;

/**
 * Title:  Construct Binary Tree from Preorder and Inorder Traversal (LeetCode 105)  Topic: Binary Tree General   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
 *
 * <p>
 * Problem:
 * Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder
 * is the inorder traversal of the same tree, construct and return the binary tree.
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        int size = preorder.length;

        if (size == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);
        int mid = findIndex(inorder, preorder[0]);


        int[] leftP = Arrays.copyOfRange(preorder, 1, mid + 1);
        int[] leftI = Arrays.copyOfRange(inorder, 0, mid);

        int[] rightP = Arrays.copyOfRange(preorder, mid + 1, size);
        int[] rightI = Arrays.copyOfRange(inorder, mid + 1, size);

        root.left = buildTree(leftP, leftI);
        root.right = buildTree(rightP, rightI);

        return root;

    }

    private int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
