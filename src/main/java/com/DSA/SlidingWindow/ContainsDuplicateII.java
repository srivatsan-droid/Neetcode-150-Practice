package com.DSA.SlidingWindow;

import java.util.HashSet;

public class ContainsDuplicateII {
    public static boolean containsDuplicate(int nums[],int k) {
        for(int i = 0;i < nums.length;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] == nums[j] && Math.abs(i-j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containsDuplicateOptimized(int nums[],int k) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0;
        for(int right = 0;right < nums.length;right++) {
            if(set.contains(nums[right])) {
                return true;
            }
            set.add(nums[right]);
            if(right - left >= k) {
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};
        int k = 2;
        boolean ans = containsDuplicateOptimized(nums,k);
        System.out.println(ans);
    }
}
