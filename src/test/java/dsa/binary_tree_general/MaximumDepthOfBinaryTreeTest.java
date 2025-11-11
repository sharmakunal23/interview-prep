package dsa.binary_tree_general;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaximumDepthOfBinaryTreeTest {
    private MaximumDepthOfBinaryTree maximumDepthOfBinaryTree;
    private TreeNode root;

    @BeforeEach
    void setUp() {
        maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
    }

    @AfterEach
    void tearDown() {
        maximumDepthOfBinaryTree = null;
    }

    @Test
    void maxDepth() {
        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepth(root));

        root.right.left.left = new TreeNode(99);
        Assertions.assertEquals(4, maximumDepthOfBinaryTree.maxDepth(root));
    }

    @Test
    void maxDepthIterativeDFS() {
        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepthIterativeDFS(root));

        root.right.left.left = new TreeNode(99);
        Assertions.assertEquals(4, maximumDepthOfBinaryTree.maxDepthIterativeDFS(root));
    }

    @Test
    void maxDepthIterativeBFS() {
        Assertions.assertEquals(3, maximumDepthOfBinaryTree.maxDepthIterativeBFS(root));

        root.right.left.left = new TreeNode(99);
        Assertions.assertEquals(4, maximumDepthOfBinaryTree.maxDepthIterativeBFS(root));
    }
}