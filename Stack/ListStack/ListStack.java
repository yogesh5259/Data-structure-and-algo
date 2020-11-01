package com.data.ListStack;

import java.util.EmptyStackException;
import java.util.Iterator;

public class ListStack<E> implements Stack<E>, Iterable<E> {
    java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public ListStack(){

    }

    public ListStack(E elem){
        push(elem);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public void push(E elem) {
        list.addLast(elem);
    }

    @Override
    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E data = list.removeLast();
        return data;
    }

    @Override
    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return list.peekLast();
    }

    //Search about the element Starting from top of stack
    // Return -1 if element is not present
    public int search(E elem){
        return list.size() - list.lastIndexOf(elem);
    }

    //iterate over stack

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
