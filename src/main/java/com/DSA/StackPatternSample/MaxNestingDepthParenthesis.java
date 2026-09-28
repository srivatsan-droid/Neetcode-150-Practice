package com.DSA.StackPatternSample;

public class MaxNestingDepthParenthesis {
    public static int maxDepth(String s) {
        int depth = 0;
        int r = 0;
        for(char c : s.toCharArray()) {
            if(c == ')') {
                depth--;
                continue;
            }
            if(c != '(')
                continue;
            depth++;
            if(depth > r) {
                r = depth;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int ans = maxDepth(s);
        System.out.println(ans);
    }
}
