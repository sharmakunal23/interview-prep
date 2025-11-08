package dsa.heap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInAnArrayTest {
    private KthLargestElementInAnArray kthLargestElementInAnArray;

    @BeforeEach
    void setUp() {
        kthLargestElementInAnArray = new KthLargestElementInAnArray();
    }

    @AfterEach
    void tearDown() {
        kthLargestElementInAnArray = null;
    }

    @Test
    void findKthLargest() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1};
        assertEquals(5, kthLargestElementInAnArray.findKthLargest(nums, 1));
        assertEquals(4, kthLargestElementInAnArray.findKthLargest(nums, 2));
        assertEquals(4, kthLargestElementInAnArray.findKthLargest(nums, 3));
        assertEquals(3, kthLargestElementInAnArray.findKthLargest(nums, 4));
    }
}