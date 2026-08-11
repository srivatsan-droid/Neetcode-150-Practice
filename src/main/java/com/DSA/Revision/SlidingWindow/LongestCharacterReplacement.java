package com.DSA.Revision.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestCharacterReplacement {
    public static int characterReplacement(String s,int k) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0,i = 0,max = 0;
        for(int j = 0;j < s.length();j++) {
            char c = s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            max = Math.max(max,map.get(c));
            while((j - i + 1) > k) {
                char left = s.charAt(i);
                map.put(left,map.get(left) - 1);
                i++;
            }
            res = Math.max(res,j - i + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "abca";
        int k = 2;
        int ans = characterReplacement(s,k);
        System.out.println(ans);
    }
}
