package com.DSA.Revision.ArraysRevision1;

public class ValidAnagram {
    public static boolean isAnagram(String s,String t) {
        int sLen = s.length();
        int tLen = t.length();
        int count[] = new int[26];
        if(sLen != tLen)
            return false;
        for(int i = 0;i < sLen;i++) {
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
        String s = "rat";
        String t = "car";
        boolean ans = isAnagram(s,t);
        System.out.println(ans);
    }
}
