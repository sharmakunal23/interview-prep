package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexOfTheFirstOccurrenceInAStringTest {
    private FindIndexOfTheFirstOccurrenceInAString test;

    @BeforeEach
    void setUp() {
        test = new FindIndexOfTheFirstOccurrenceInAString();
    }

    @AfterEach
    void tearDown() {
        test = null;
    }

    @Test
    void strStr() {
        String haystack = "haystack";
        String needle = "needle";
        assertEquals(-1, test.strStr(haystack, needle));

        haystack = "haystack";
        needle = "hay";
        assertEquals(0, test.strStr(haystack, needle));

        haystack = "haystack";
        needle = "ack";
        assertEquals(5, test.strStr(haystack, needle));

        haystack = "ac";
        needle = "ack";
        assertEquals(-1, test.strStr(haystack, needle));

        haystack = "ac";
        needle = "";
        assertEquals(0, test.strStr(haystack, needle));

        haystack = "";
        needle = "";
        assertEquals(0, test.strStr(haystack, needle));
    }
}