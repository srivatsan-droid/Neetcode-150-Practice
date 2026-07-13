package com.DSA.Revision.TwoPointers;

public class ContainerWithMostWater {
    public static int maxAreaBrute(int height[]) {
        int res = 0;
        for(int i = 0;i < height.length;i++) {
            for(int j = i + 1;j < height.length;j++) {
                res = Math.max(res,Math.min(height[i],height[j]) * (j-i));
            }
        }
        return res;
    }
    public static int maxAreaOptimized(int height[]) {
        int left = 0,right = height.length-1;
        int maxArea = 0;
        while(left < right) {
            int width = right - left;
            int area = Math.min(height[left],height[right]) * width;
            maxArea = Math.max(maxArea,area);
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int height[] = {1,1};
        int ans = maxAreaOptimized(height);
        System.out.println(ans);
    }
}
