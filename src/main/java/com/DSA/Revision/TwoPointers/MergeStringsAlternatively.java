package com.DSA.Revision.TwoPointers;

public class MergeStringsAlternatively {
    public static String merge(String a,String b) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < a.length() || i < b.length()) {
            if(i < a.length()) {
                sb.append(a.charAt(i));
            }
            if(i < b.length()) {
                sb.append(b.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "def";
        String ans = merge(s,t);
        System.out.println(ans);
    }
}
