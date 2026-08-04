package com.DSA.Revision.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int nums[]) {
        int result[] = new int[nums.length];
        int prefix = 1;
        for(int i = 0;i < nums.length;i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i = nums.length-1;i >= 0;i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int ans[] = productExceptSelf(nums);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
