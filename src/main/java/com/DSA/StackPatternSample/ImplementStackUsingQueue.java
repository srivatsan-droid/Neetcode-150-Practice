package com.DSA.StackPatternSample;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        // Rotate queue so newest element is at front
        for(int i = 0; i < queue.size() - 1; i++) {
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
public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        MyStack queue = new MyStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.top();
        boolean ans = queue.empty();
        System.out.println(ans);
    }
}
