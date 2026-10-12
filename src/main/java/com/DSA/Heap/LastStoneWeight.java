package com.DSA.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone : stones) {
            maxHeap.offer(stone);
        }
        while(maxHeap.size() >= 2) {
            int first = maxHeap.poll();
            int second = maxHeap.poll();
            if(first != second) {
                maxHeap.offer(first - second);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
    public static void main(String[] args) {
        int stones[] = {2,7,4,1,8,1};
        int ans = lastStoneWeight(stones);
        System.out.println(ans);
    }
}
