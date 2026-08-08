package com.DSA.Revision.TwoPointers;

public class ValidPalindrome {

    public static boolean isValidPalindrome(String s) {

        String cleanedString = s
                .replaceAll("[^A-Za-z0-9]", "")
                .toLowerCase();

        int left = 0;
        int right = cleanedString.length() - 1;

        while (left <= right) {

            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        boolean ans = isValidPalindrome(s);

        System.out.println(ans);
    }
}