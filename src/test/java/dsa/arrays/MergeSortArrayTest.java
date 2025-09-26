package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortArrayTest {

    private MergeSortArray mergeSortArray;

    @BeforeEach
    void setUp() {
        mergeSortArray = new MergeSortArray();
    }

    @AfterEach
    void tearDown() {
        mergeSortArray = null;
    }

    @Test
    void testBruteForceMerge() {
        int[] nums1 = new int[]{1,2,3,4,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,4};
        mergeSortArray.bruteForceMerge(nums1, 4, nums2, 4);
        Assertions.assertArrayEquals(new int[]{1,1,2,2,3,3,4,4}, nums1);

        int[] nums3 = new int[]{7,8,9,10,11,0,0,0,0};
        int[] nums4 = new int[]{1,2,3,4};
        mergeSortArray.bruteForceMerge(nums3, 5, nums4, 4);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,7,8,9,10,11}, nums3);


        int [] nums5 = new int[]{0,0,0,0};
        int [] nums6 = new int[]{0,0,0,0};
        mergeSortArray.bruteForceMerge(nums5, 0, nums6, 0);
        Assertions.assertArrayEquals(new int[]{0,0,0,0}, nums5);
    }

    @Test
    void testOptimizedMerge() {
        int[] nums1 = new int[]{1,2,3,4,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,4};
        mergeSortArray.optimizedMerge(nums1, 4, nums2, 4);
        Assertions.assertArrayEquals(new int[]{1,1,2,2,3,3,4,4}, nums1);

        int[] nums3 = new int[]{7,8,9,10,11,0,0,0,0};
        int[] nums4 = new int[]{1,2,3,4};
        mergeSortArray.optimizedMerge(nums3, 5, nums4, 4);
        Assertions.assertArrayEquals(new int[]{1,2,3,4,7,8,9,10,11}, nums3);


        int [] nums5 = new int[]{0,0,0,0};
        int [] nums6 = new int[]{0,0,0,0};
        mergeSortArray.optimizedMerge(nums5, 0, nums6, 0);
        Assertions.assertArrayEquals(new int[]{0,0,0,0}, nums5);
    }
}