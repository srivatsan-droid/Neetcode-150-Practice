package com.DSA.Arrays;
import java.util.*;

public class MajorityElement {
    public static int majorityElement(int nums[]) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int freq = n / 2;
        for(int key : map.keySet()) {
            if(map.get(key) > freq) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        int ans = majorityElement(nums);
        System.out.println(ans);
    }
}
