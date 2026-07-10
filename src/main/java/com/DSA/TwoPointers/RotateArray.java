package com.DSA.TwoPointers;

public class RotateArray {
    public static void rotate(int nums[],int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int nums[],int left,int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public static void printArray(int nums[]) {
        for(int i = 0;i < nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums,k);
        printArray(nums);
    }
}
