package com.DSA.Greedy;

public class MaxSubArray {
    public static int maxArray(int arr[]) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        for(int i = 0;i < n;i++) {
            sum += arr[i];
            if(sum > max) {
                max = Math.max(max,sum);
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxArray(nums);
        System.out.println(ans);
    }
}
