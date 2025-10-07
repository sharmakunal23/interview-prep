package dsa.dynamic_programming;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {
    private ClimbingStairs climbingStairs;

    @BeforeEach
    void setUp() {
        climbingStairs = new ClimbingStairs();
    }

    @AfterEach
    void tearDown() {
        climbingStairs = null;
    }

    @Test
    void climbStairs() {
        assertEquals(2, climbingStairs.climbStairs(2));
        assertEquals(3, climbingStairs.climbStairs(3));
        assertEquals(8, climbingStairs.climbStairs(5));
    }

    @Test
    void climbStairsMemoization() {
        assertEquals(2, climbingStairs.climbStairsMemoization(2));
        assertEquals(3, climbingStairs.climbStairsMemoization(3));
        assertEquals(8, climbingStairs.climbStairsMemoization(5));
    }
}