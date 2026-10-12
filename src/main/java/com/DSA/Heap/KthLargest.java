package com.DSA.Heap;

import java.util.PriorityQueue;

public class KthLargest {
    private int k;
    private PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);

        for (int num : nums) {
            if (minHeap.size() < k) {
                minHeap.offer(num);
            } else if (num > minHeap.peek()) {
                minHeap.offer(num);

                if (minHeap.size() > k) {
                    minHeap.poll();
                }
            }
        }
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.offer(val);
            minHeap.poll();
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};

        KthLargest kthLargest = new KthLargest(k, nums);

        System.out.println(kthLargest.add(3));  // 4
        System.out.println(kthLargest.add(5));  // 5
        System.out.println(kthLargest.add(10)); // 5
        System.out.println(kthLargest.add(9));  // 8
        System.out.println(kthLargest.add(4));  // 8
    }
}