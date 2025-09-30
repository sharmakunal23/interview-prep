package dsa.hashmap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicateIITest {
    private ContainsDuplicateII containsDuplicate;

    @BeforeEach
    void setUp() {
        containsDuplicate = new ContainsDuplicateII();
    }

    @AfterEach
    void tearDown() {
        containsDuplicate = null;
    }

    @Test
    void containsNearbyDuplicate() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        Assertions.assertTrue(containsDuplicate.containsNearbyDuplicate(nums, k));

        k = 1;
        Assertions.assertFalse(containsDuplicate.containsNearbyDuplicate(nums, k));
    }
}