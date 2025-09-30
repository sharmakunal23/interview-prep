package dsa.hashmap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HappyNumberTest {
    private HappyNumber happyNumber;

    @BeforeEach
    void setUp() {
        happyNumber = new HappyNumber();
    }

    @AfterEach
    void tearDown() {
        happyNumber = null;
    }

    @Test
    void isHappy() {
        int n = 19;
        Assertions.assertTrue(happyNumber.isHappy(n));

        n = 2;
        Assertions.assertFalse(happyNumber.isHappy(n));
    }
}