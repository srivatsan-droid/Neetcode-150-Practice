package com.DSA.BitManipulation;

public class CountingBits {
    public static int[] countingBits(int n) {
        int ans[] = new int[n + 1];
        for(int i = 1;i <= n;i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 2;
        int ans[] = countingBits(n);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
