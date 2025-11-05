package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {
    private StringToInteger stringToInteger;

    @BeforeEach
    void setUp() {
        stringToInteger = new StringToInteger();
    }

    @AfterEach
    void tearDown() {
        stringToInteger = null;
    }

    @Test
    void myAtoi() {
        assertEquals(0, stringToInteger.myAtoi("0"));
        assertEquals(0, stringToInteger.myAtoi(" "));
        assertEquals(0, stringToInteger.myAtoi(" 0"));
        assertEquals(0, stringToInteger.myAtoi(" 0  "));
        assertEquals(0, stringToInteger.myAtoi(" 0  "));
        assertEquals(0, stringToInteger.myAtoi(" 0  "));
        assertEquals(0, stringToInteger.myAtoi(" 0  "));
        assertEquals(1, stringToInteger.myAtoi(" 1  "));
        assertEquals(123, stringToInteger.myAtoi(" 123asd  "));
        assertEquals(0, stringToInteger.myAtoi(" adasdsd1234  "));
    }
}