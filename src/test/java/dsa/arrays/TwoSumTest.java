package dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TwoSumTest {

    private final TwoSum twoSum  = new TwoSum();

    @Test
    void example() {
        assertArrayEquals(new int[]{0,1}, twoSum.hashMapSolution(new int[]{2,7,11,15}, 9));
    }

    @Test
    void duplicates() {
        assertArrayEquals(new int[]{0,1}, twoSum.hashMapSolution(new int[]{3,3}, 6));
    }

    @Test
    void negativesAndPositives() {
        assertArrayEquals(new int[]{4,5}, twoSum.hashMapSolution(new int[]{-1,-2,-3,-4,-5,10}, 5));
    }

    @Test
    void noSolution_throws() {
        assertThrows(IllegalArgumentException.class, () -> twoSum.hashMapSolution(new int[]{1,2,3}, 100));
    }
}
