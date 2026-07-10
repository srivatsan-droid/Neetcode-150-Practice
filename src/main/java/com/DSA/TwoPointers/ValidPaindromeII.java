package com.DSA.TwoPointers;

public class ValidPaindromeII {
    public static boolean validPalindrome(String s) {
        int left = 0,right = s.length()-1;
        while(left <= right) {
            if(s.charAt(left) == s.charAt(right)) {
               left++;
               right--;
            }
            else {
                return isValidPalindrome(s,left+1,right) || isValidPalindrome(s,left,right-1);
            }
        }
        return true;
    }
    public static boolean isValidPalindrome(String s,int left,int right) {
        while(left < right) {
            if(s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "abca";
        boolean ans = validPalindrome(s);
        System.out.println(ans);
    }
}
