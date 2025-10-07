package dsa.arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {
    private BestTimeToBuyAndSellStock bt;

    @BeforeEach
    void setUp() {
        bt =  new BestTimeToBuyAndSellStock();
    }

    @AfterEach
    void tearDown() {
        bt = null;
    }

    @Test
    void maxProfit() {
        int[] prices = new int[] {7,1,5,3,6,4};
        assertEquals(5, bt.maxProfit(prices));

        prices = new int[] {7,6,4,3,1};
        assertEquals(0, bt.maxProfit(prices));
    }
}