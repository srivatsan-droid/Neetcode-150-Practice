package com.DSA.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class BestTimeToBuySellStock {
    public static int maxProfit(int nums[]) {
        int max = 0,profit = 0;
        for(int i = 0;i < nums.length;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] < nums[j]) {
                    profit = nums[j] - nums[i];
                }
                max = Math.max(max,profit);
            }
        }
        return max;
    }
    public static int maxOptimized(int nums[]) {
        int left = 0;
        int max = 0;
        for(int right = 0;right < nums.length;right++) {
            if(nums[left] < nums[right]) {
                left = right;
            }
            else {
                max = Math.max(max,nums[right] - nums[left]);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {7,6,4,3,1};
        int ans = maxOptimized(nums);
        System.out.println(ans);
    }
}
