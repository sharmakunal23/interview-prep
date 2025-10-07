package dsa.binary_tree_general;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountCompleteTreeNodesTest {
    private CountCompleteTreeNodes countCompleteTreeNodes;
    private TreeNode node;

    @BeforeEach
    void setUp() {
        countCompleteTreeNodes = new CountCompleteTreeNodes();
        node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
    }

    @AfterEach
    void tearDown() {
        countCompleteTreeNodes = null;
    }

    @Test
    void countNodes() {
        assertEquals(7, countCompleteTreeNodes.countNodes(node));
    }
}