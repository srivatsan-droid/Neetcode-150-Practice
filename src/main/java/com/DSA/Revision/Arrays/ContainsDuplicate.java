package com.DSA.Revision.Arrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int nums[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) > 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        boolean ans = containsDuplicate(nums);
        System.out.println(ans);
    }
}
