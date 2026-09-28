package com.DSA.BitManipulation;

public class MissingNumber {
    public static int bruteForce(int nums[]) {
        int n = nums.length;
        for(int i = 0;i <= n;i++) {
            boolean found = false;
            for(int num : nums) {
                if(num == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                return i;
            }
        }
        return -1;
    }
    public static int optimized(int nums[]) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for(int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int nums[] = {3,0,1};
        int ans = optimized(nums);
        System.out.println(ans);
    }
}
