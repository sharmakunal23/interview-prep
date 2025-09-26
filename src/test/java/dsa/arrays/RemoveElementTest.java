package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveElementTest {

    private RemoveElement removeElement;

    @BeforeEach
    void setUp() {
        removeElement = new RemoveElement();
    }

    @AfterEach
    void tearDown() {
        removeElement = null;
    }

    @Test
    void bruteForceRemoveElement() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int val = 1;
        Assertions.assertEquals(4, removeElement.bruteForceRemoveElement(nums, val));

        nums = new int[]{3, 2, 2, 3};
        val = 3;
        Assertions.assertEquals(2, removeElement.bruteForceRemoveElement(nums, val));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        Assertions.assertEquals(5, removeElement.bruteForceRemoveElement(nums, val));
    }

    @Test
    void optimizedRemoveElement() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int val = 1;
        Assertions.assertEquals(4, removeElement.optimizedRemoveElement(nums, val));

        nums = new int[]{3, 2, 2, 3};
        val = 3;
        Assertions.assertEquals(2, removeElement.optimizedRemoveElement(nums, val));

        nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        val = 2;
        Assertions.assertEquals(5, removeElement.optimizedRemoveElement(nums, val));
    }
}