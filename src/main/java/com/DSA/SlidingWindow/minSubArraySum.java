package com.DSA.SlidingWindow;

public class minSubArraySum {
    public static int minArray(int nums[],int target) {
        int left = 0;
        int min = Integer.MAX_VALUE,sum = 0;
        for(int right = 0;right < nums.length;right++) {
            sum += nums[right];
            while(sum >= target) {
                min = Math.min(min,right - left + 1);
                sum -= nums[left];
                left++;
            }

        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        int ans = minArray(nums,target);
        System.out.println(ans);
    }
}
