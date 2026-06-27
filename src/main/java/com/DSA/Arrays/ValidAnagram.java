package com.DSA.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s,String t) {
        /*
        Optimized Approach :
        Initialize an Count with Size Why because with this we can mark the Character we see in String s
        Once Marked the character at String s will be 1 for all its chars and unmark all the characters of String t so that if the count array is array at the end
        Return true else return false
         */
        int count[] = new int[26];
        if(s.length() != t.length()) {
            return false;
        }
        for(int i = 0;i < s.length();i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int cnt : count) {
            if(cnt != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
}
