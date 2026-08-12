package com.DSA.SlidingWindow;

import java.util.*;

public class KClosestElements {
    public static List<Integer> findClosestElements(int nums[],int k,int x) {
        int left = 0;
        int right = nums.length - 1;
        while(right - left >= k) {
            if(Math.abs(nums[left] - x) > (Math.abs(nums[right])- x)) {
                left++;
            }
            else {
                right--;
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = left;i <= right;i++) {
            result.add(nums[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        List<Integer> ans = findClosestElements(nums,k,x);
        for(int i = 0;i < ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }
}
