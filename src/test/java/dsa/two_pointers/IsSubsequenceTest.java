package dsa.two_pointers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsSubsequenceTest {

    private IsSubsequence isSubsequence;

    @BeforeEach
    void setUp() {
        isSubsequence = new IsSubsequence();
    }

    @AfterEach
    void tearDown() {
        isSubsequence = null;
    }

    @Test
    void isSubsequence() {
        String s = "abc";
        String t = "abc";
        assertTrue(isSubsequence.isSubsequence(s, t));

        s = "abc";
        t = "ahbgdc";
        assertTrue(isSubsequence.isSubsequence(s, t));

        s = "axc";
        t = "ahbgdc";
        assertFalse(isSubsequence.isSubsequence(s, t));
    }
}