package com.DSA.DP;

public class HouseRobberI {
    public static int rob(int nums[]) {
        int n = nums.length;
        if (n == 0) return 0;
        if(n == 1) {
            return nums[0];
        }
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);
        for(int i = 2;i < n;i++) {
            int skip = dp[i];
            int rob = nums[i] + dp[i-2];
            dp[i] = Math.max(skip,rob);
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int nums[] = {2,7,9,3,1};
        int ans = rob(nums);
        System.out.println(ans);
    }
}
