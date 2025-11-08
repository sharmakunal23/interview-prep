package dsa.binary_tree_general;

/**
 * Title:  Kth Smallest Element in a BST (LeetCode 230)   Topic: Binary Tree General   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
 *
 * <p>
 * Problem:
 * Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
 */
public class KthSmallestElementInABST {
    int count = 0;
    int res;
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return res;
    }

    public void inorder(TreeNode root, int k) {
        if(root == null) {
            return ;
        }

        inorder(root.left, k);
        count++;
        if(count == k) {
            res = root.val;
            System.gc();
            return;
        }
        inorder(root.right, k);
    }
}
