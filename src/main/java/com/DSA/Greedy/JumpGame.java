package com.DSA.Greedy;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int goal = nums.length-1;//Say the max element we imagine
        for(int i = nums.length-2; i>= 0 ;i--){
            if(i + nums[i] >= goal){
                goal = i;
            }
        }
        return goal == 0;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        boolean ans = canJump(nums);
        System.out.println(ans);
    }
}
