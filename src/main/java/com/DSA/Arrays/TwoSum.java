package com.DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSumBrute(int nums[],int target) {
        for(int i = 0;i < nums.length;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    /*
    Optimized Sol :
    Compute the Diff of the Current Number and Target
    Initialize an Map and check if its having the diff if yes return the diff along with the index
    Else add the Number along with the index to the Map
     */
    public static int[] twoSumOptimized(int nums[],int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        int ans[] = twoSumOptimized(nums,target);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
