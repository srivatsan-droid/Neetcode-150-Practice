package com.DSA.Arrays;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String s[]) {
        int size = s.length;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(s);
        String firstChar = s[0];
        String lastChar = s[s.length-1];
        for(int i = 0;i < Math.min(firstChar.length(),lastChar.length());i++) {
            if(firstChar.charAt(i) != lastChar.charAt(i)) {
                return sb.toString();
            }
            sb.append(firstChar.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s[] = {"flower","flora","flight"};
        String ans = longestCommonPrefix(s);
        System.out.println(ans);
    }
}
