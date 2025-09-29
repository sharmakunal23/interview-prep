package dsa.geometry;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LargestPerimeterTriangleTest {
    private LargestPerimeterTriangle largestPerimeterTriangle;

    @BeforeEach
    void setUp() {
        largestPerimeterTriangle = new LargestPerimeterTriangle();
    }

    @AfterEach
    void tearDown() {
        largestPerimeterTriangle = null;
    }

    @Test
    void largestPerimeter() {
        int[] nums = new int[] {2, 1, 2};
        Assertions.assertEquals(5, largestPerimeterTriangle.largestPerimeter(nums));

        nums = new int[] {1, 2, 1, 10};
        Assertions.assertEquals(0, largestPerimeterTriangle.largestPerimeter(nums));
    }

    @Test
    void canFormTraingle() {
        Assertions.assertTrue(largestPerimeterTriangle.canFormTraingle(2, 1, 2));
        Assertions.assertFalse(largestPerimeterTriangle.canFormTraingle(2, 1, 10));
    }
}