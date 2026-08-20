package com.DSA.Revision.Stack;

import java.util.*;

class MinStack {
    private Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        int min = stack.isEmpty()
                ? x
                : Math.min(stack.peek().min, x);

        stack.push(new Pair(x, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().value;
    }

    public int getMin() {
        return stack.peek().min;
    }

    // Stores the value and minimum value at each level
    private static class Pair {
        int value;
        int min;

        Pair(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
}

public class MinStackMain {

    public static void main(String[] args) {

        MinStack stack = new MinStack();

        // Push elements
        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);
        stack.push(4);

        System.out.println("Top: " + stack.top());
        System.out.println("Minimum: " + stack.getMin());

        // Remove 4
        stack.pop();

        System.out.println("After pop:");
        System.out.println("Top: " + stack.top());
        System.out.println("Minimum: " + stack.getMin());

        // Remove 2
        stack.pop();

        System.out.println("After another pop:");
        System.out.println("Top: " + stack.top());
        System.out.println("Minimum: " + stack.getMin());
    }
}