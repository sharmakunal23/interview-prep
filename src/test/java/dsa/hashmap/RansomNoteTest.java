package dsa.hashmap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RansomNoteTest {
    private RansomNote ransomNote;

    @BeforeEach
    void setUp() {
        ransomNote = new RansomNote();
    }

    @AfterEach
    void tearDown() {
        ransomNote = null;
    }

    @Test
    void canConstruct() {
        String magazine = "abc";
        String note = "abc";
        Assertions.assertTrue(ransomNote.canConstruct(magazine, note));

        magazine = "abc";
        note = "abd";
        Assertions.assertFalse(ransomNote.canConstruct(magazine, note));
    }

    @Test
    void optimizedCanConstruct() {
        String magazine = "abc";
        String note = "abc";
        Assertions.assertTrue(ransomNote.optimizedCanConstruct(magazine, note));

        magazine = "abc";
        note = "abd";
        Assertions.assertFalse(ransomNote.optimizedCanConstruct(magazine, note));
    }
}