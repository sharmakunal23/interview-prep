package dsa.binary_tree_general;

/**
 * Title:  Lowest Common Ancestor of a Binary Search Tree (LeetCode 235)   Topic: Binary Tree General   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
 *
 * <p>
 * Problem:
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
 * <p>
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes
 * p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */
public class LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {
            if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else if (p.val < root.val && q.val < root.val){
                root = root.left;
            } else {
                return root;
            }
        }

        return null;
    }
}
