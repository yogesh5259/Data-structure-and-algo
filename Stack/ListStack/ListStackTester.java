package com.data.ListStack;

public class ListStackTester {
    public static void main(String[] args) {
        ListStack<Integer> stack = new ListStack<>();

        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.search(47));
        stack.pop();
        stack.pop();
        System.out.println(stack.pop());
    }
}
