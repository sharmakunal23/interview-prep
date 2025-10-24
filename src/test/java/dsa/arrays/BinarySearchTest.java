package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @AfterEach
    void tearDown() {
        binarySearch = null;
    }

    @Test
    void search() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10};

        assertEquals(8, binarySearch.search(nums, 9));
        assertEquals(7, binarySearch.search(nums, 8));
        assertEquals(6, binarySearch.search(nums, 7));
        assertEquals(5, binarySearch.search(nums, 6));

        assertEquals(-1, binarySearch.search(nums, 11));
    }
}