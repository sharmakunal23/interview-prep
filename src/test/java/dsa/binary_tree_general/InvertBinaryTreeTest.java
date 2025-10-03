package dsa.binary_tree_general;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvertBinaryTreeTest {
    private InvertBinaryTree invertBinaryTree;

    @BeforeEach
    void setUp() {
        invertBinaryTree = new InvertBinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
    }

    @AfterEach
    void tearDown() {
        invertBinaryTree = null;
    }

    @Test
    void invertTree() {
        TreeNode result = new TreeNode(4);
        result.left = new TreeNode(7);
        result.right = new TreeNode(2);
        result.left.left = new TreeNode(9);
        result.left.right = new TreeNode(6);
        result.right.left = new TreeNode(3);
        result.right.right = new TreeNode(1);
        assertEquals(invertBinaryTree.invertTree(result), result);
    }
}