package com.DSA.StackPatternSample;

import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < nums.length;i++) {
            while(!st.isEmpty() && nums[i] > st.peek()) {
                int value = st.pop();
                System.out.println(value + " found greater: " + nums[i]);
            }
            st.push(nums[i]);
        }
    }
}
