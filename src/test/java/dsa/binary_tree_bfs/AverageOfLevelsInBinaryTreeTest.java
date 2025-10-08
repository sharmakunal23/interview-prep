package dsa.binary_tree_bfs;

import dsa.binary_tree_general.TreeNode;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AverageOfLevelsInBinaryTreeTest {
    private AverageOfLevelsInBinaryTree instance;
    private TreeNode root;

    @BeforeEach
    void setUp() {
        instance = new AverageOfLevelsInBinaryTree();
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
        instance = null;
        root = null;
    }

    @Test
    void averageOfLevels() {
        List<Double> expected = List.of(1.0, 2.5, 5.5);
        List<Double> actual = instance.averageOfLevels(root);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}