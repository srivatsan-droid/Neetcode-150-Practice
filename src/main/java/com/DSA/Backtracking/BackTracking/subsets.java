package com.DSA.Backtracking.BackTracking;

import java.util.*;

public class subsets {
    public static List<List<Integer>> subsets(int nums[]) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        findSubsets(nums,0,subset,res);
        return res;
    }
    private static void findSubsets(int nums[],int ind,List<Integer> subset,List<List<Integer>> res) {
        if(ind >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[ind]);
        findSubsets(nums,ind+1,subset,res);
        subset.remove(subset.size() - 1);
        findSubsets(nums,ind + 1,subset,res);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
