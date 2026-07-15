package com.DSA.SlidingWindow;

public class BestTimeToBuySellStock {
    public static int bruteForce(int nums[]){
        int maxProfit = 0;
        for(int i = 0;i < nums.length;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] < nums[j]) {
                    int profit = nums[j] - nums[i];
                    maxProfit = Math.max(maxProfit,profit);
                }
            }
        }
        return maxProfit;
    }
    public static int optimized(int nums[]) {
        int left = 0;
        int maxProfit = 0;
        for(int right = 1;right < nums.length;right++) {
            if(nums[left] < nums[right]) {
                nums[left] = nums[right];
            }
            else {
                maxProfit = Math.max(maxProfit,nums[right] - nums[left]);
            }
            right++;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int nums[] = {7,6,4,3,1};
        int ans = optimized(nums);
        System.out.println(ans);
    }
}
