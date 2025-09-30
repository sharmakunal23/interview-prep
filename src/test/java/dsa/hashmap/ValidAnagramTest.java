package dsa.hashmap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {
    private ValidAnagram validAnagram;

    @BeforeEach
    void setUp() {
        validAnagram = new ValidAnagram();
    }

    @AfterEach
    void tearDown() {
        validAnagram = null;
    }

    @Test
    void isAnagram() {
        String s = "anagram";
        String t = "anagram";
        Assertions.assertTrue(validAnagram.isAnagram(s, t));

        s = "anagram";
        t = "anagrma";
        Assertions.assertTrue(validAnagram.isAnagram(s, t));

        s = "anagram";
        t = "anagran";
        Assertions.assertFalse(validAnagram.isAnagram(s, t));

        s = "anagram";
        t = "anagramt";
        Assertions.assertFalse(validAnagram.isAnagram(s, t));
    }
}