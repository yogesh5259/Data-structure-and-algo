package com.data.IntStack;

public class IntStack implements Stack<Integer> {

    private int[] arr;
    private int position = 0;

    public IntStack(int capacity){
        arr = new int[capacity];
    }
    @Override
    public int size() {
        return position;
    }

    @Override
    public boolean isEmpty() {
        return position == 0;
    }

    @Override
    public void push(Integer elem) {
        arr[position++] = elem; // set element and increase
    }

    @Override
    public Integer pop() {
        return arr[--position]; // decrease position and return
    }

    @Override
    public Integer peek() {
        return arr[position - 1];
    }
}
