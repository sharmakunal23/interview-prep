package dsa.intervals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SummaryRangesTest {
    private SummaryRanges summaryRanges;

    @BeforeEach
    void setUp() {
        summaryRanges = new SummaryRanges();
    }

    @AfterEach
    void tearDown() {
        summaryRanges = null;
    }

    @Test
    void summaryRanges() {
        int[] nums = new int[] {0,1,2,4,5,7};
        List<String> range = List.of("0->2","4->5","7");
        Assertions.assertEquals(range, summaryRanges.summaryRanges(nums));
    }
}