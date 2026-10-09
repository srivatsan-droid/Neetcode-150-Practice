package com.DSA.Revision.SlidingWindow;

public class BestTimeToBuySellStock {
    public static int maxProfit(int prices[]) {
        int profit = 0;
        int max = 0;
        for(int i = 0;i < prices.length;i++) {
            for(int j = i + 1;j < prices.length;j++) {
                if(prices[i] < prices[j]) {
                    profit = prices[j] - prices[i];
                }
                max = Math.max(max,profit);
            }
        }
        return max;
    }
    public static int maxProfitOptimized(int prices[]) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        int ans = maxProfitOptimized(prices);
        System.out.println(ans);
    }
}
