package com.data.ArrayQueue;

public class ArrayQueue<E> implements Queue<E> {

    private Object[] data;
    private int front;
    private int rear;
    public ArrayQueue(int capacity){
        data = new Object[capacity + 1];
        front = 0;
        rear = 0;
    }
    @Override
    public void offer(E elem) {
        if (isFull()) throw new RuntimeException("Queue full");
        data[rear++] = elem;
        rear = adjustIndex(rear,data.length);
    }

    @Override
    public E poll() {
        if (isEmpty()) throw new RuntimeException("Queue is Empty");
        front = adjustIndex(front,data.length);
        return (E) data[front++];
    }

    @Override
    public E peek() {
        if(isEmpty()) throw new RuntimeException("Queue is Empty");
         front = adjustIndex(front,data.length);
        return (E) data[front];
    }

    @Override
    public int size() {
        return adjustIndex(rear + data.length - front,data.length);
    }

    //Store one less element than predefined size so add one to size
    public boolean isFull(){
        return (front + data.length - rear) % data.length == 1;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    private int adjustIndex(int index, int size){
        return index >= size ? index - size : index;
    }
}
