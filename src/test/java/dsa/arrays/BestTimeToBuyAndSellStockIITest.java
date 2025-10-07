package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockIITest {
    private BestTimeToBuyAndSellStockII bt;

    @BeforeEach
    void setUp() {
        bt = new BestTimeToBuyAndSellStockII();
    }

    @AfterEach
    void tearDown() {
        bt = null;
    }

    @Test
    void maxProfit() {
        int[] prices = new int[] {7,1,5,3,6,4};
        assertEquals(7, bt.maxProfit(prices));

        prices = new int[] {1,2,3,4,5};
        assertEquals(4, bt.maxProfit(prices));
    }
}