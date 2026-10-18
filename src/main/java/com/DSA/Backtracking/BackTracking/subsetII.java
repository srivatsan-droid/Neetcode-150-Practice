package com.DSA.Backtracking.BackTracking;

import java.util.*;
public class subsetII {
    public static List<List<Integer>> subsets(int nums[]) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        findSubsets(nums,0,subset,res);
        return res;
    }
    private static void findSubsets(int nums[],int ind,List<Integer> subset,List<List<Integer>> res) {
        res.add(new ArrayList<>(subset));
        for(int i = ind;i < nums.length;i++) {
            if(i > ind && nums[i] == nums[i-1])
                continue;
            subset.add(nums[i]);
            findSubsets(nums,i + 1,subset,res);
            subset.remove(subset.size() - 1);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        List<List<Integer>> ans = subsets(nums);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
