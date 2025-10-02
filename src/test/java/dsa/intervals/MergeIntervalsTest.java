package dsa.intervals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    private MergeIntervals mergeIntervals;

    @BeforeEach
    void setUp() {
        mergeIntervals = new MergeIntervals();
    }

    @AfterEach
    void tearDown() {
        mergeIntervals = null;
    }

    @Test
    void merge() {
        int[][] intervals = new int[][] {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] expectedResults = new int[][] {{1,6}, {8,10}, {15,18}};

        Assertions.assertArrayEquals(expectedResults, mergeIntervals.merge(intervals));

        intervals =  new int[][] {{4,7}, {1,4}};
        expectedResults = new int[][] {{1,7}};
        Assertions.assertArrayEquals(expectedResults, mergeIntervals.merge(intervals));
    }
}