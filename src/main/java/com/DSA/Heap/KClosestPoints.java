package com.DSA.Heap;

import java.util.Arrays;
import java.util.*;

public class KClosestPoints {
    public static int[][] kClosest(int[][] points, int k) {

        // Step 1: Create Max Heap
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> (b[0]*b[0] + b[1]*b[1])
                        - (a[0]*a[0] + a[1]*a[1])
        );


        // Step 2: Iterate through points
        for(int point[] : points) {
            maxHeap.offer(point);
            if(maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        // Step 4: Return k closest points
        int result[][] = new int[k][2];
        for(int i = 0;i < k;i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] points = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        System.out.println(
                Arrays.deepToString(kClosest(points, k))
        );
    }
}
