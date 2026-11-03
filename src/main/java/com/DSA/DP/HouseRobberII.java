package com.DSA.DP;

public class HouseRobberII {
    public static int rob(int nums[]) {
        int n = nums.length;
        if(n == 0)
            return 0;
        if(n == 1)
            return nums[0];
        int case1 = robLinear(nums,0,n-2);
        int case2 = robLinear(nums,0,n-1);
        return Math.max(case1,case2);
    }
    private static int robLinear(int nums[],int start,int end) {
        int size = end - start + 1;
        int dp[] = new int[size];
        dp[0] = nums[start];
        if(size == 1)
            return dp[0];
        dp[1] = Math.max(nums[start],nums[start + 1]);
        for(int i = 2;i < size - 1;i++) {
            int skip = dp[i-1];
            int rob = nums[start + i] + dp[i - 2];
            dp[i] = Math.max(skip,rob);
        }
        return dp[size - 1];
    }
    public static void main(String[] args) {
        int nums[] = {2,3,2};
        int ans = rob(nums);
        System.out.println(ans);
    }
}
