package dsa.hashmap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WordPatternTest {
    private WordPattern wordPattern;

    @BeforeEach
    void setUp() {
        wordPattern = new WordPattern();
    }

    @AfterEach
    void tearDown() {
        wordPattern = null;
    }

    @Test
    void wordPattern() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        Assertions.assertTrue(wordPattern.wordPattern(pattern, s));

        pattern = "abba";
        s = "dog cat cat cat";
        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));

        pattern = "abba";
        s = "dog cat cat dog cat";
        Assertions.assertFalse(wordPattern.wordPattern(pattern, s));
    }
}