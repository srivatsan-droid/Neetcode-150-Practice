package com.DSA.DP;

public class MinCostClimbingStairs {
    public static int minCostClimbing(int cost[]) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= n; i++) {
            int fromPrevious = dp[i - 1] + cost[i - 1];
            int fromTwoBack = dp[i - 2] + cost[i - 2];

            dp[i] = Math.min(fromPrevious, fromTwoBack);
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int cost[] = {10,15,20};
        int ans = minCostClimbing(cost);
        System.out.println(ans);
    }
}
