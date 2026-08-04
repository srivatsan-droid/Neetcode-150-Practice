package com.DSA.Arrays;

import java.util.*;

public class MajorityElementII {
    public static List<Integer> majorityElement(int nums[]) {
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int freq = n / 3;
        for(int key : map.keySet()) {
            if(map.get(key) > freq) {
                result.add(key);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3};
        List<Integer> ans = majorityElement(nums);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
