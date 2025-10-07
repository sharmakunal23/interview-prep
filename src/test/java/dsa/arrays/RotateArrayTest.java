package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {
    private RotateArray rotateArray;

    @BeforeEach
    void setUp() {
        rotateArray = new RotateArray();
    }

    @AfterEach
    void tearDown() {
        rotateArray = null;
    }

    @Test
    void rotate() {
        int[] testArray = {1, 2, 3, 4, 5};
        int k = 2;
        int[] expected = {4, 5, 1, 2, 3};

        rotateArray.rotate(testArray, k);
        assertArrayEquals(expected, testArray);
    }
}