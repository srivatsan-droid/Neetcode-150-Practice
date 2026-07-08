package com.DSA.TwoPointers;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int nums[]) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i < nums.length;i++) {
            for(int j = i + 1;j < nums.length;j++) {
                for(int k = j+1;k < nums.length;k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> threeSumOptimized(int nums[]) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < nums.length-2;i++) {
            int j = i + 1;
            int k = nums.length-1;
            if(i > j && nums[i] == nums[i-1]) {
                continue;
            }
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k-1]) {
                        continue;
                    }
                    j++;
                    k--;
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSumOptimized(nums);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
