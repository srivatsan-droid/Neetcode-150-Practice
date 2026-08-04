package com.DSA.Arrays;

import java.util.ArrayList;

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
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int m = (l + r) / 2;
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m + 1;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }


        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }

        for (i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
    public static void main(String[] args) {
        int nums[] = {5,2,3,1};
        sortArray(nums);
        printArray(nums);

    }
}
