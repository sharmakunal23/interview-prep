package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    private MajorityElement majorityElement;

    @BeforeEach
    void setUp() {
        majorityElement = new MajorityElement();
    }

    @AfterEach
    void tearDown() {
        majorityElement = null;
    }

    @Test
    void majorityElement() {
        int[] nums = new int[] {3,2,3};
        Assertions.assertEquals(3, majorityElement.majorityElement(nums));

        nums = new int[] {3,2,2,1,2,2};
        Assertions.assertEquals(2, majorityElement.majorityElement(nums));

        nums = new int[] {3,2,3};
        Assertions.assertEquals(3, majorityElement.majorityElement(nums));
    }
}