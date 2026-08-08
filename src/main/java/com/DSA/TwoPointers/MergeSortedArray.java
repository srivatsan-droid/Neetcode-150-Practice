package com.DSA.TwoPointers;

public class MergeSortedArray {
    public static void merge(int nums1[],int m,int nums2[],int n) {
        int left = m-1,right = n-1;
        int k = m + n - 1;
        while(right >= 0) {
            if(left >= 0 && nums1[left] > nums2[right]) {
                nums1[k--] = nums1[left--];
            }
            else {
                nums1[k--] = nums2[right--];
            }
        }
    }
    public static void printArray(int nums1[]) {
        for(int i = 0;i < nums1.length;i++) {
            System.out.println(nums1[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int m = 3;
        int nums2[] = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        printArray(nums1);
    }
}
