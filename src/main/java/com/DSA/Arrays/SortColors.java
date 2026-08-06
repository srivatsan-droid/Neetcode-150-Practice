package com.DSA.Arrays;

public class SortColors {
    public static void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;

            } else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int nums[]) {
        for(int i = 0;i < nums.length;i++) {
            System.out.println(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,6,7,1,2,3,9};
        sortColors(nums);
        printArray(nums);
    }
}
