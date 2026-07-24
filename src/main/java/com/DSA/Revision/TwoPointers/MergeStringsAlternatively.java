package com.DSA.Revision.TwoPointers;

public class MergeStringsAlternatively {

    public static String mergeString(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                ans.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                ans.append(word2.charAt(i));
            }

            i++;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        String ans = mergeString(word1, word2);
        System.out.println(ans);
    }
}