package com.DSA.BitManipulation;

import java.util.*;

public class SingleNumber {
    public static int singleNumber(int nums[]) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int freq = 1;
        for(int key : map.keySet()) {
            if(map.get(key) == freq) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
}
