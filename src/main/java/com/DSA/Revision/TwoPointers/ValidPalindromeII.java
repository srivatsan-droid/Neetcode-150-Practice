package com.DSA.Revision.TwoPointers;

public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int left = 0,right = s.length()-1;
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }
            else {
                return checkPalindrome(s,left++,right) || checkPalindrome(s,left,right--);
            }
        }
        return true;
    }
    public static boolean checkPalindrome(String s,int left,int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abc";
        boolean ans = validPalindrome(s);
        System.out.println(ans);
    }
}
