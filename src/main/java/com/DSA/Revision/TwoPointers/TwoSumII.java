package com.DSA.Revision.TwoPointers;

public class TwoSumII {
    public static int[] twoSumOptimized(int nums[],int target) {
        int left = 0,right = nums.length-1;
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return new int[] {left+1,right+1};
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args) {
        int nums[] = {-1,0};
        int target = -1;
        int ans[] = twoSumOptimized(nums,target);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
