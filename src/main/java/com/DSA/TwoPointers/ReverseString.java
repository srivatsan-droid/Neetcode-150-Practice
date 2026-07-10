package com.DSA.TwoPointers;

public class ReverseString {
    public static void reverse(char[] s) {
        int left = 0,right = s.length-1;
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void printArray(char[] s) {
        for (char c : s) {
            System.out.println(c + " ");
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverse(s);
        printArray(s);
    }
}
