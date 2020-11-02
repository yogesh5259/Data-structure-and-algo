package com.data.ListQueue;
import java.util.Iterator;
import java.util.LinkedList;

public class ListQueue<E> implements Queue<E>, Iterable<E> {
    java.util.LinkedList<E> list = new LinkedList<>();

    public ListQueue(){

    }
    public ListQueue(E elem){
        offer(elem);
    }

    @Override
    public void offer(E elem) {
        list.addLast(elem);
    }

    @Override
    public E poll() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return list.removeFirst();
    }

    @Override
    public E peek() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return list.peekFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}
