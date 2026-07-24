package com.DSA.Revision.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int nums[]) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < nums.length-1;i++) {
            int j = i + 1;
            int k = nums.length-1;
            if(i > j && nums[i] == nums[i-1])
                continue;
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
    public static void main(String[] ars) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
