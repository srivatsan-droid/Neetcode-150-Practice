package com.DSA.Revision.Stack;

import java.util.*;

class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);

        for (int i = 0; i < queue.size() - 1; i++) {
            queue.add(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

public class ImplementStackUsingQueues {

    public static void main(String[] args) {

        MyStack st = new MyStack();

        st.push(1);
        st.push(2);
        st.push(3);

        int ans = st.top();
        System.out.println("The Top Element is : " + ans);

        int pop = st.pop();
        System.out.println("Popped Element : " + pop);

        boolean result = st.empty();
        System.out.println("Is Empty : " + result);
    }
}