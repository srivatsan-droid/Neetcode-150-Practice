package com.DSA.Revision.TwoPointers;

public class ValidPalindromeII {
    public static boolean isValidPalindomeII(String s) {
        int left = 0,right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                return checkPalindrome(s,left+1,right) || checkPalindrome(s,left,right-1);
            }
        }
        return true;
    }
    private static boolean checkPalindrome(String s,int left,int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aba";
        boolean ans = isValidPalindomeII(s);
        System.out.println(ans);
    }
}
