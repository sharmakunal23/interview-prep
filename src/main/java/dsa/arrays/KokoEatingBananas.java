package dsa.arrays;

/**
 * Title:  Koko Eating Banana (LeetCode 875)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/koko-eating-bananas/description/
 *
 * <p>
 * Problem:
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 * <p>
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 * <p>
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 * <p>
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 */
public class KokoEatingBananas {
    /**
     1. Minimum speed at which koko can eat is 1 and maximum is max(piles)
     2. use binary search and start with the mid, if the mid can eat all bananas under h than shift right to mid - 1 and set k to min(k, currentK).
     3. Create a function that calculates if the mid value is enough to eat all the bananas
     */
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = findMax(piles);

        while (left < right) {
            int mid = left + ((right - left) / 2);
            int hours = maxHours(piles, mid);

            if (hours <= h) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int maxHours(int[] piles, int k) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }
        return hours;
    }

    private int findMax(int[] piles) {
        int max = piles[0];
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }
}
