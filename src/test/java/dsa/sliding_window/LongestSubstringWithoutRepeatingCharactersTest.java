package dsa.sliding_window;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    void setUp() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @AfterEach
    void tearDown() {
        longestSubstringWithoutRepeatingCharacters = null;
    }

    @Test
    void lengthOfLongestSubstring() {
        String s = "abcabcbb";
        Assertions.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));

        s = "bbbbb";
        Assertions.assertEquals(1, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));

        s = "pwwkew";
        Assertions.assertEquals(3, longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s));
    }
}