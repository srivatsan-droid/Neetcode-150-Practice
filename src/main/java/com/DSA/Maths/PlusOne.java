package com.DSA.Maths;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int digits[]) {

        for(int right = digits.length-1;right >= 0;right--) {
            if(digits[right] < 9) {
                digits[right] = digits[right] + 1;
                return digits;
            }
            digits[right] = 0;
        }
        int ans[] = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args) {
        int digits[] = {1,2,3};
        int ans[] = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }
}
