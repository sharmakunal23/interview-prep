package dsa.binary_tree_general;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SymmetricTreeTest {
    private SymmetricTree symmetricTree;
    private TreeNode root;

    @BeforeEach
    void setUp() {
        symmetricTree = new SymmetricTree();
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
    }

    @AfterEach
    void tearDown() {
        symmetricTree = null;
    }

    @Test
    void isSymmetric() {
        assertTrue(symmetricTree.isSymmetric(root));

        root.right.right.left = new TreeNode(5);
        assertFalse(symmetricTree.isSymmetric(root));
    }
}