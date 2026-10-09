package com.DSA.Revision.SlidingWindow;

import java.util.*;

public class LongestSubStringWithoutRepeatingChars {
    public static int lengthOfLongestSuubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        int right = 0;
        while(right < s.length()) {
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength,right-left + 1);
            right++;
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = lengthOfLongestSuubstring(s);
        System.out.println(ans);
    }
}
