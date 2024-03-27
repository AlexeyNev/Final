package org.example.StackExample;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Alex");
        stack.push("Alla");
        stack.push("Mars");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
