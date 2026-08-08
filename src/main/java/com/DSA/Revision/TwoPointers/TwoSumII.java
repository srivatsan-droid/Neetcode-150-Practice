package com.DSA.Revision.TwoPointers;

public class TwoSumII {
    public static int[] twoSum(int nums[],int target) {
        int left = 0,right = nums.length-1;
        while(left <= right) {
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
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int num[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(num,target);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
