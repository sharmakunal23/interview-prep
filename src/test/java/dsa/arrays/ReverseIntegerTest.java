package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    private ReverseInteger reverse;

    @BeforeEach
    void setUp() {
        reverse = new ReverseInteger();
    }

    @AfterEach
    void tearDown() {
        reverse = null;
    }

    @Test
    void reverse() {
        assertEquals(1, reverse.reverse(1));
        assertEquals(321, reverse.reverse(123));
        assertEquals(-321, reverse.reverse(-123));
        assertEquals(54321, reverse.reverse(12345));
        assertEquals(0, reverse.reverse(2147483647));
        assertEquals(0, reverse.reverse(-2147483647));
    }
}