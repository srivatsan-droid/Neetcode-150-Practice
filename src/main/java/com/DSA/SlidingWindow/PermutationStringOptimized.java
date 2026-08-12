package com.DSA.SlidingWindow;

import java.util.Arrays;

public class PermutationStringOptimized {
    public static boolean checkPermutation(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if(n2 < n1)
            return false;
        int countS1[] = new int[26];
        int countS2[] = new int[26];
        for(int i = 0; i < n1; i++) {  // FIX: Use n1, not s2.length()
            countS1[s1.charAt(i) - 'a']++;
            countS2[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(countS1, countS2)) {
            return true;
        }
        for(int i = n1; i < n2; i++) {
            countS2[s2.charAt(i) - 'a']++;
            countS2[s2.charAt(i - n1) - 'a']--;
            if(Arrays.equals(countS1, countS2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean ans = checkPermutation(s1, s2);
        System.out.println(ans);  // Output: true
    }
}