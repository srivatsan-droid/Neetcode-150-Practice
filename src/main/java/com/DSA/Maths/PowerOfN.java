package com.DSA.Maths;

public class PowerOfN {
    public static double myPower(double x,double n) {
        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        double x = 2.00000;
        double n = 10;
        double ans = myPower(x,n);
        System.out.println(ans);
    }
}
