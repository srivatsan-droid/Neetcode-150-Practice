package com.DSA.BinarySearch;

public class SearchRotatedSortedArray {
    public static int searchRotatedArrayBrute(int nums[],int target) {
        int n = nums.length;
        for(int i = 0;i < n;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int searchRotatedArray(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[low] <= nums[mid]) {

                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            // Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }

            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = searchRotatedArray(nums,target);
        System.out.println(ans);
    }
}
