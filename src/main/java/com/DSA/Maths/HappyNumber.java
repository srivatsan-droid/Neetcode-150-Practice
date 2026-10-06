package com.DSA.Maths;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();

        while (n != 1) {

            // If we have seen this number before,
            // we are stuck in a cycle
            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);

            // Calculate the next number
            n = happy(n);
        }

        return true;
    }

    public static int happy(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = 2;

        boolean ans = isHappy(n);

        System.out.println(ans);
    }
}