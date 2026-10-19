package com.DSA.Backtracking.BackTracking;

import java.util.*;
public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder stack = new StringBuilder();
        generate(0,0,n,result,stack);
        return result;
    }
    private static void generate(int open,int closed,int n,List<String> result,StringBuilder stack) {
        if(open == closed && open == n) {
            result.add(stack.toString());
            return;
        }
        if(open < n) {
            stack.append('(');
            generate(open + 1,closed,n,result,stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if(closed < open) {
            stack.append(')');
            generate(open,closed + 1,n,result,stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        for(int i = 0 ;i < result.size();i++) {
            System.out.println(result.get(i) + " ");
        }
    }
}
