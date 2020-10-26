package com.data.ArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<E> implements List<E> {
    private E[] arr;
    private int length = 0;
    private int capacity = 0;

    public DynamicArray(){
        this(10);
    }

    public DynamicArray(int capacity){
        if (capacity < 0) throw new IllegalArgumentException();
        this.capacity = capacity;
        arr = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public E get(int index) {
        if (index >= length || index < 0) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    @Override
    public void set(int index, E elem) {
        if (index >= length || index < 0) throw  new IndexOutOfBoundsException();
        arr[index] = elem;
    }

    @Override
    public void clear() {
        for (int i = 0; i < length; i++) {
            arr[i] = null;
        }
        length = 0;
    }

    @Override
    public void add(E elem) {
        // Resize the Array
        if (length + 1 >= capacity) {
            if (capacity == 0) capacity = 1;
            else capacity *= 2;
            E[] new_arr = (E[]) new Object[capacity];
            for (int i = 0; i < length; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;
        }
        arr[length++] = elem;
    }

    @Override
    public E removeAt(int index) {
        if (index >= length || index < 0) throw new IndexOutOfBoundsException();
        E data = arr[index];
        E[] new_arr = (E[]) new Object[length - 1];
        for (int i = 0, j = 0; i < length; i++, j++) {
            if (i == index) j--;
            else new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --length; // capacity = length - 1
        return data;
    }

    @Override
    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) return false;
        removeAt(index);
        return true;
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < length; i++) {
            if (obj == null){
                if (arr[i] == null) return i;
            } else {
                if (obj.equals(arr[i])) return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public String toString() {
        if (length == 0) return "[]";
        StringBuilder sb = new StringBuilder(length);
        sb.append("[");
        for (int i = 0; i < length - 1; i++) {
            sb.append(arr[i]).append(",");
        }
        return sb.append(arr[length - 1]).append("]").toString();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public E next() {
                return arr[index++];
            }
        };

    }
}
