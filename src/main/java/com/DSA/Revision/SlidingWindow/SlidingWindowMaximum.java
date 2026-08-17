package com.DSA.Revision.SlidingWindow;
import java.util.*;
public class SlidingWindowMaximum {
    public static int[] slidingWindowMaxBrute(int nums[],int k) {
        int n = nums.length;
        int result[] = new int[n - k +1];
        for(int i = 0;i <= n-k;i++) {
            int max = nums[i];
            for(int j = i + 1;j < i+ k;j++) {
                max = Math.max(max,nums[j]);
            }
            result[i] = max;
        }
        return result;
    }
    public static int[] slidingMaximumOptimized(int nums[],int k) {
        int n = nums.length;
        int result[] = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for(int right = 0;right < n;right++) {
            while(!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[right]) {
                deque.pollLast();
            }
            deque.addLast(right);
            if(right >= k-1) {
                result[right - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int ans[] = slidingMaximumOptimized(nums,k);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
