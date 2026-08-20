package com.DSA.StackPatternSample;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            // Opening brackets
            if (c == '{' || c == '(' || c == '[') {
                st.push(c);
            }

            // Closing brackets
            else {

                if (st.isEmpty()) {
                    return false;
                }

                if (c == ')' && st.peek() != '(') {
                    return false;
                }

                if (c == ']' && st.peek() != '[') {
                    return false;
                }

                if (c == '}' && st.peek() != '{') {
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {

        String s = "()[]{}";

        boolean ans = isValid(s);

        System.out.println(ans);
    }
}