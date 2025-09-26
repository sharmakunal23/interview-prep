package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @BeforeEach
    void setUp() {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @AfterEach
    void tearDown() {
        removeDuplicatesFromSortedArray = null;
    }

    @Test
    void bruteForceRemoveDuplicates() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 4, 4, 5};
        Assertions.assertEquals(6, removeDuplicatesFromSortedArray.bruteForceRemoveDuplicates(nums));

        nums = new int[]{1, 1, 2};
        Assertions.assertEquals(2, removeDuplicatesFromSortedArray.bruteForceRemoveDuplicates(nums));

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Assertions.assertEquals(5, removeDuplicatesFromSortedArray.bruteForceRemoveDuplicates(nums));
    }

    @Test
    void optimizedRemoveDuplicates() {
        int[] nums = new int[]{0, 1, 2, 2, 3, 4, 4, 5};
        Assertions.assertEquals(6, removeDuplicatesFromSortedArray.optimizedRemoveDuplicates(nums));

        nums = new int[]{1, 1, 2};
        Assertions.assertEquals(2, removeDuplicatesFromSortedArray.optimizedRemoveDuplicates(nums));

        nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Assertions.assertEquals(5, removeDuplicatesFromSortedArray.optimizedRemoveDuplicates(nums));
    }
}