package com.DSA.Arrays;

import java.util.Arrays;

public class FindMissingPositive {
    public static int firstMissingPositive(int nums[]) {
        Arrays.sort(nums);
        int missing = 1;
        for(int num : nums) {
            if(num > 0 && missing == num) {
                missing++;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,0};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }
}
