package dsa.stack;

import java.util.Arrays;

/**
 * Title: Car Fleet (LeetCode 853)   Topic: Stack   Difficulty: Medium
 * Link: https://leetcode.com/problems/daily-temperatures/description/
 *
 * <p>
 * Problem:
 * There are n cars at given miles away from the starting mile 0, traveling to reach the mile target.
 * <p>
 * You are given two integer arrays position and speed, both of length n, where position[i] is the starting mile of the ith car and speed[i] is the speed of the ith car in miles per hour.
 * <p>
 * A car cannot pass another car, but it can catch up and then travel next to it at the speed of the slower car.
 * <p>
 * A car fleet is a single car or a group of cars driving next to each other. The speed of the car fleet is the minimum speed of any car in the fleet.
 * <p>
 * If a car catches up to a car fleet at the mile target, it will still be considered as part of the car fleet.
 * <p>
 * Return the number of car fleets that will arrive at the destination.
 */
public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int size = position.length;
        if (size == 1) return 1;

        Pair[] cars = new Pair[size];

        for (int i = 0; i < size; i++) {
            int pos = position[i];
            double time = (double) (target - position[i]) / speed[i];
            cars[i] = new Pair(position[i], time);
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(b.position, a.position));

        int fleets = 0;
        double lastTime = 0.0;
        for (Pair car : cars) {
            if (car.time > lastTime) {
                fleets++;
                lastTime = car.time;
            }
        }
        return fleets;
    }

    private class Pair {
        int position;
        double time;
        public Pair(int position, double time) {
            this.position = position;
            this.time = time;
        }
    }

    public int carFleet2(int target, int[] position, int[] speed) {
        float[] time = new float[target];
        for (int i = 0; i < speed.length; i++) {
            time[position[i]] = (float)(target-position[i])/speed[i];
        }
        int count = 0;
        float maxi = 0;
        for (int i = time.length - 1; i >= 0; i--) {
            if (time[i] > maxi) {
                count++;
                maxi = time[i];
            }
        }
        return count;
    }
}
