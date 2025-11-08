package dsa.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Title:  K Closest Points to Origin (LeetCode 973)   Topic: Heap / Priority Queue   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/k-closest-points-to-origin/description/
 *
 * <p>
 * Problem:
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the k closest points to the origin (0, 0).
 * <p>
 * The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).
 */
public class KClosestPointToTheOrigin {
    public int[][] kClosest(int[][] points, int k) {

        Queue<Data> heap = new PriorityQueue<>(
                (a, b) -> Double.compare(a.distance, b.distance)
        );

        int size = points.length;

        for (int i = 0; i < size; i++) {
            double distance = euclideanDistance(points[i]);
            Data data = new Data(points[i], distance);
            heap.add(data);
        }

        int[][] closestPoints = new int[k][2];

        while (k > 0) {
            closestPoints[k-1] = heap.poll().point;
            k--;
        }

        return closestPoints;

    }

    private double euclideanDistance(int[] point) {
        double x = Math.pow(point[0], 2);
        double y = Math.pow(point[1], 2);

        return Math.sqrt(x + y);
    }

    private class Data {
        int[] point;
        double distance;

        public Data(int[] point, double distance) {
            this.point = point;
            this.distance = distance;
        }
    }
}
