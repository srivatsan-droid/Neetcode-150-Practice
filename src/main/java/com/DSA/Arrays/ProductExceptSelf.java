package com.DSA.Arrays;

public class ProductExceptSelf {
    /*
    Optimized :
    Prefix : To Compute the Product of Elements Before the Array Find it add it to the result
    Suffix : To Compute the Products of Elements after which means from right to left and find the ans and Multiply with the Existing Result
     */
    public static int[] ProductExceptSelfOptimized(int nums[]) {
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
        int nums[] = {1,2,3,4};
        int ans[] = ProductExceptSelfOptimized(nums);
        for(int i = 0;i < ans.length;i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
