package com.DSA.Revision.Stack;

import java.util.Stack;

public class BaseBallGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("C")) {
                st.pop();

            } else if (op.equals("D")) {
                st.push(st.peek() * 2);

            } else if (op.equals("+")) {
                int last = st.pop();
                int secondLast = st.peek();

                st.push(last);
                st.push(last + secondLast);

            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : st) {
            sum += score;
        }

        return sum;
    }
    public static void main(String[] args) {
        String operations[] = {"5","2","C","D","+"};
        int ans = calPoints(operations);
        System.out.println(ans);
    }
}
