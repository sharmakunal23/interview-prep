package dsa.arrays;

/**
 * Title:  Best Time to Buy and Sell Stock (LeetCode 121)   Topic: Arrays   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuyAndSellStock {
    /**
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while (right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
            } else {
                maxProfit = Math.max(prices[right] -  prices[left], maxProfit);
            }
            right++;
        }
        return maxProfit;
    }
}
