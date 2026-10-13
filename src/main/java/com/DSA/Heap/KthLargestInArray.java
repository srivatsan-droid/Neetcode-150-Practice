package com.DSA.Heap;

import java.util.PriorityQueue;

public class KthLargestInArray {
    public  static int kthLargest(int nums[],int k)  {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int num : nums)  {
            if(minHeap.size() < k) {
                minHeap.offer(num);
            }
            else if(num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        int ans = kthLargest(nums,k);
        System.out.println(ans);
    }
}
