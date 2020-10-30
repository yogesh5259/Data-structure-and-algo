package com.data.ArrayStack;

public interface Stack<E> {

    // return the number of element in stack
    public int size();

    // return if stack is empty
    public boolean isEmpty();

    // push element on top of stack
    public void push(E elem);

    //pop element from the stack
    public E pop();

    //peek the element from the stack
    public E peek();

}
