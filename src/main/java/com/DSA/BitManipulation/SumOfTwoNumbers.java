package com.DSA.BitManipulation;

public class SumOfTwoNumbers {
    public static int sumBrute(int a,int b) {
        return a + b;
    }
    public static int sumOptimized(int a,int b) {
        while(b != 0) {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int ans = sumOptimized(a,b);
        System.out.println(ans);
    }
}
