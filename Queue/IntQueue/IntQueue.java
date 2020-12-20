package com.data.IntQueue;

public class IntQueue implements Queue<Integer> {
    private int[] array;
    int front,rear,size;

    public IntQueue(int capacity){
        array = new int[capacity];
        front = rear = size = 0;
    }
    @Override
    public void offer(Integer elem) {
        if (isFull()) throw new RuntimeException("Queue Full");
        array[rear++] = elem;
        size++;
        rear = rear % array.length;
    }

    @Override
    public Integer poll() {
        if (isEmpty()) throw new RuntimeException("Queue empty");
        size--;
        front = front % array.length;
        return array[front++];
    }

    @Override
    public Integer peek() {
        if(isEmpty()) throw new RuntimeException("Queue empty");
        front = front % array.length;
        return array[front];
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
    public boolean isFull() {
        return size == array.length;
    }
}
