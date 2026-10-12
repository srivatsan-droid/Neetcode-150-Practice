package com.DSA.Heap;

import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(1);
        minHeap.offer(2);
        minHeap.offer(3);

        System.out.println(minHeap.peek());
        System.out.println(minHeap.poll());
        System.out.println(minHeap.peek());
    }
}
