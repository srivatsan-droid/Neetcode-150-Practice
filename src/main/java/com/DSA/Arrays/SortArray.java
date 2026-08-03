package com.DSA.Arrays;

public class SortArray {
    public static void sortArrayBrute(int[] nums) {
        int n = nums.length;
        for(int i = 0;i < n;i++) {
            for(int j = i + 1;j < n;j++) {
                if(nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void printArray(int nums[]) {
        for(int i = 0;i < nums.length;i++) {
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        sortArrayBrute(nums);
        printArray(nums);

    }
}
