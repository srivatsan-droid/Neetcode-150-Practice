package com.DSA.SlidingWindow;

import java.util.*;

public class MinWindowSubString {
    public static String minWindowBrute(String s,String t) {
        Map<Character,Integer> need = new HashMap<>();
        for(char ch : t.toCharArray()) {
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        int minLen = Integer.MAX_VALUE;
        int start = -1;
        for(int i = 0;i < s.length();i++) {
            Map<Character,Integer> window = new HashMap<>();
            for(int j = i;j < s.length();j++) {
                char ch =  s.charAt(j);
                window.put(ch,window.getOrDefault(ch,0)+1);
                if(isValid(window,need)) {
                    if(j-i+1 < minLen) {
                        minLen = j - i + 1;
                        start = i;
                    }
                }
            }
        }
        if(start == -1) {
            return "";
        }
        return s.substring(start,start+minLen);
    }
    private static boolean isValid(Map<Character,Integer> window,Map<Character,Integer> need) {
        for(char ch : need.keySet()) {
            if(window.getOrDefault(ch,0) < need.get(ch)) {
                return false;
            }
        }
        return true;
    }
    public static String minWindowSubString(String s,String t) {
        Map<Character,Integer> need = new HashMap<>();
        for(char ch : t.toCharArray()) {
            need.put(ch,need.getOrDefault(ch,0)+1);
        }
        int required = need.size();
        int formed = 0;
        int left = 0;
        Map<Character,Integer> window = new HashMap<>();
        int minLength = Integer.MAX_VALUE,minStart = 0;
        for(int right = 0;right < s.length();right++) {
            char rightChar = s.charAt(right);
            window.put(rightChar,window.getOrDefault(rightChar,0)+1);
            if(need.containsKey(rightChar) && window.get(rightChar).equals(need.get(rightChar))) {
                formed++;
            }
            while(formed == required && left <= right) {
                if(right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar,window.get(leftChar)-1);
                if(need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }

                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String ansBrute = minWindowSubString(s,t);
        System.out.println(ansBrute);
    }
}
