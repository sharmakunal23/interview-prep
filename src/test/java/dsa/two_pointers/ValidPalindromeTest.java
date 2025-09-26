package dsa.two_pointers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ValidPalindromeTest {
    private ValidPalindrome validPalindrome;

    @BeforeEach
    void setUp() {
        validPalindrome = new ValidPalindrome();
    }

    @AfterEach
    void tearDown() {
        validPalindrome = null;
    }

    @Test
    void isPalindrome() {
        assertFalse(validPalindrome.isPalindrome("abc"));
        assertTrue(validPalindrome.isPalindrome(" "));
        assertTrue(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(validPalindrome.isPalindrome("race a car"));
        assertFalse(validPalindrome.isPalindrome("Lorem ipsum"));
    }
}