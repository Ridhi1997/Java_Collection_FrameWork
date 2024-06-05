package org.java.Stack;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ridhi"); //push () will add the value in stack
        stack.push("Nidhi");
        stack.push("Golu");
        stack.push("Rupa");

        System.out.println(stack);

        System.out.println(stack.peek()); // peek() will give the top element in the stack i.e Rupa

        stack.pop(); // pop() will remove the top data from stack i.e Rupa

        System.out.println(stack);
        System.out.println(stack.peek()); // Golu
        System.out.println(stack.isEmpty()); // false
    }
}
