package com.DSA.SlidingWindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int[] maxSlidingwindow(int nums[],int k) {
        if(nums == null || nums.length == 0)
            return new int[0];
        int n = nums.length;
        int res[] = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0;i < n;i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i >= k- 1) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int ans[] = maxSlidingwindow(nums,k);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
