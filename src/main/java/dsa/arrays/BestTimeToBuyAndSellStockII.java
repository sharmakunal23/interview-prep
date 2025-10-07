package dsa.arrays;

/**
 * Title:  Best Time to Buy and Sell Stock II (LeetCode 122)   Topic: Arrays   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day. <p>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time.
 * However, you can sell and buy the stock multiple times on the same day, ensuring you never hold than one share of the stock. <p>
 * Find and return the maximum profit you can achieve.
 */
public class BestTimeToBuyAndSellStockII {
    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
