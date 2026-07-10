package com.DSA.TwoPointers;

public class MergeAlternatively {
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
        String a = "abc";
        String b = "cda";
        String ans = merge(a,b);
        System.out.println(ans);
    }
}
