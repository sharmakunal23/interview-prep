package dsa.math;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber;

    @BeforeEach
    void setUp() {
        palindromeNumber = new PalindromeNumber();
    }

    @AfterEach
    void tearDown() {
        palindromeNumber = null;
    }

    @Test
    void isPalindromeBruteForce() {
        assertTrue(palindromeNumber.isPalindromeBruteForce(123321));
        assertFalse(palindromeNumber.isPalindromeBruteForce(1234));
    }

    @Test
    void isPalindromeOptimized() {
        assertTrue(palindromeNumber.isPalindromeOptimized(123321));
        assertFalse(palindromeNumber.isPalindromeOptimized(1234));
    }
}