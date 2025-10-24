package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SearchA2DMatrixTest {
    private SearchA2DMatrix searchA2DMatrix;

    @BeforeEach
    void setUp() {
        searchA2DMatrix = new SearchA2DMatrix();
    }

    @AfterEach
    void tearDown() {
        searchA2DMatrix = null;
    }

    @Test
    void searchMatrix() {
        int[][] matrix = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};

        assertTrue(searchA2DMatrix.searchMatrix(matrix, 3));
        assertTrue(searchA2DMatrix.searchMatrix(matrix, 16));
        assertTrue(searchA2DMatrix.searchMatrix(matrix, 60));
        assertFalse(searchA2DMatrix.searchMatrix(matrix, 4));
        assertFalse(searchA2DMatrix.searchMatrix(matrix, 15));
        assertFalse(searchA2DMatrix.searchMatrix(matrix, 24));
    }
}