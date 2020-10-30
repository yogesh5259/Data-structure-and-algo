package com.data.ArrayStack;

import java.util.ArrayDeque;

public class ArrayStackTester {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 50; i++) {
            stack.push(i);
        }

        System.out.println(stack.size());

       for (int i = 0; i < 50; i++) {
           System.out.println(stack.pop());
       }
        System.out.println(stack.size());
    }
}
