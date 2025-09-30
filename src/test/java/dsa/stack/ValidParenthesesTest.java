package dsa.stack;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    void setUp() {
        validParentheses = new ValidParentheses();
    }

    @AfterEach
    void tearDown() {
        validParentheses = null;
    }

    @Test
    void isValid() {
        String s = "()[]{}";
        Assertions.assertTrue(validParentheses.isValid(s));

        s = ")[]{}";
        Assertions.assertFalse(validParentheses.isValid(s));
    }
}