package com.data.IntStack;

public class IntStackTester {
    public static void main(String[] args) {
        IntStack stack = new IntStack(10);

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println(stack.size());
        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }
}
