package com.DSA.Revision.TwoPointers;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0,right = s.length-1;
        while(left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void printCharArray(char[] s) {
        for(int i = 0;i < s.length;i++) {
            System.out.println(s[i] + " ");
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        printCharArray(s);
    }
}
