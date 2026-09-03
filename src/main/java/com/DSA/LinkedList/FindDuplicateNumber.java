package com.DSA.LinkedList;

import java.util.*;

public class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int last = 0;
        for(int num : nums) {
            if(set.contains(num)) {
                last = num;
            }
            set.add(num);
        }
        return last;
    }
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
}
