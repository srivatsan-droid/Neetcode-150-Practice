package com.DSA.Revision.TwoPointers;

public class TrappingRainWater {
    public static int Trapping(int height[]) {
        int left = 0,right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;
        while(left < right) {
            if(leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax,height[left]);
                water += leftMax - height[left];
            }
            else {
                right--;
                rightMax = Math.max(rightMax,height[right]);
                water += rightMax - height[right];
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int ans = Trapping(height);
        System.out.println(ans);
    }
}
