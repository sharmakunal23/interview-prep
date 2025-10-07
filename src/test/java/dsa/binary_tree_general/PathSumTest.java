package dsa.binary_tree_general;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PathSumTest {
    private PathSum pathSum;
    private TreeNode root;

    @BeforeEach
    void setUp() {
        pathSum = new PathSum();
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

    }

    @AfterEach
    void tearDown() {
        pathSum = null;
    }

    @Test
    void hasPathSum() {
        assertTrue(pathSum.hasPathSum(root, 7));
        assertTrue(pathSum.hasPathSum(root, 11));
        assertFalse(pathSum.hasPathSum(root, 12));
        assertFalse(pathSum.hasPathSum(root, 15));
    }
}