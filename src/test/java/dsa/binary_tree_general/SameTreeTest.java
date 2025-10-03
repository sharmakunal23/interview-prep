package dsa.binary_tree_general;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SameTreeTest {
    private SameTree s;
    private TreeNode p;
    private TreeNode q;

    @BeforeEach
    void setUp() {
        s = new SameTree();
        p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
    }

    @AfterEach
    void tearDown() {
        s = null;
    }

    @Test
    void isSameTree() {
        Assertions.assertTrue(s.isSameTree(p, q));

        q.left.left = new TreeNode(4);
        Assertions.assertFalse(s.isSameTree(p, q));
    }
}