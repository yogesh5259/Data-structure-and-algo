package com.data.ListStack;

public class ListStack<E> implements Stack<E> {
    java.util.LinkedList<E> list = new java.util.LinkedList<>();
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void push(E elem) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }
}
