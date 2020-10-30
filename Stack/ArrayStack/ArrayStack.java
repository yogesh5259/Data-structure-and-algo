package com.data.ArrayStack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {
    private int size;
    private int capacity;
    private Object[] arr;

    public ArrayStack(){
        size = 0;
        capacity = 15;
        arr = new Object[capacity];
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(E elem) {
        if (size == capacity){
            capacity *= 2;
            arr = Arrays.copyOf(arr,capacity);
        }
        arr[size++] = elem;
    }

    @Override
    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E data = (E) arr[--size];
        arr[size] = null;
        return data;
    }

    @Override
    public E peek() {
        if (isEmpty()) throw new EmptyStackException();
        return (E) arr[size - 1];
    }
}
