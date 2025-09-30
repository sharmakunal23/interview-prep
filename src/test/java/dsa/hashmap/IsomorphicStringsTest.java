package dsa.hashmap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IsomorphicStringsTest {
    private IsomorphicStrings isom;

    @BeforeEach
    void setUp() {
        isom = new IsomorphicStrings();
    }

    @AfterEach
    void tearDown() {
        isom = null;
    }

    @Test
    void isIsomorphic() {
        String s = "abc";
        String t = "abc";
        Assertions.assertTrue(isom.isIsomorphic(s, t));

        s = "foo";
        t = "bar";
        Assertions.assertFalse(isom.isIsomorphic(s, t));

        s = "badc";
        t = "baba";
        Assertions.assertFalse(isom.isIsomorphic(s, t));
    }
}