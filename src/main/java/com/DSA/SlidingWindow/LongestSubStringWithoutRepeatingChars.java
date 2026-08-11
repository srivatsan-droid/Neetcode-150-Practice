package com.DSA.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    public static int longest(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0,max = 0;
        for(int right = 0;right < s.length();right++) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            max = Math.max(max,right - left);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = longest(s);
        System.out.println(ans);
    }
}
