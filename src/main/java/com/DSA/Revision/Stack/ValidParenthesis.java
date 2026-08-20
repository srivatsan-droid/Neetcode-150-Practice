package com.DSA.Revision.Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char convert = s.charAt(i);

            if (convert == '{' || convert == '[' || convert == '(') {
                st.push(convert);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                if (convert == ')' && st.peek() != '(') {
                    return false;
                }

                if (convert == '}' && st.peek() != '{') {
                    return false;
                }

                if (convert == ']' && st.peek() != '[') {
                    return false;
                }

                st.pop(); // Only remove after a successful match
            }
        }

        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()";
        boolean ans = isValid(s);
        System.out.println(ans);
    }
}
