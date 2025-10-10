package dsa.intervals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void mergeHighDefinitionIntervals() {
        List<List<Integer>> intervals = new ArrayList<>();
        intervals.add(List.of(2,3));
        intervals.add(List.of(1,6));
        intervals.add(List.of(8,10));
        intervals.add(List.of(15,18));

        List<List<Integer>> expectedResults = List.of(List.of(1,6), List.of(8,10),  List.of(15,18));

        List<List<Integer>> actualResults = mergeIntervals.mergeHighDefinitionIntervals(intervals);

        for (int i = 0; i < actualResults.size(); i++) {
            assertEquals(expectedResults.get(i), actualResults.get(i));
        }
    }


}