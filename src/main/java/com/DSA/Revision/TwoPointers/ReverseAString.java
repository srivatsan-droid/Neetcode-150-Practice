package com.DSA.Revision.TwoPointers;

public class ReverseAString {
    public static void reverseString(char[] s) {
        /*
        Two Pointers :
        Initialize Left and Right Pointers
        Create a Temp Variable and Assign the Characters to the left -> right and right -> right
        So We Can Reverse a String
         */
        int left = 0,right = s.length-1;
        while(left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    //Method to Print the Characters inside the String Array
    public static void printArray(char[] s) {
        for(int i = 0;i < s.length;i++) {
            System.out.println(s[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        printArray(s);
        reverseString(s);
        printArray(s);
    }
}
