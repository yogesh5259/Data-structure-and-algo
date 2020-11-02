package com.data.ArrayQueue;

public interface Queue<E> {
    public void offer(E elem);

    public E poll();

    public E peek();

    public int size();

    public boolean isEmpty();
}
