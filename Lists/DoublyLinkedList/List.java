package com.data.DoublyLinkedList;

public interface List<E> {

    void clear();

    int size();

    boolean isEmpty();

    void add(E elem);

    void addLast(E elem);

    void addFirst(E elem);

    void addAt(int index, E elem);

    E peekFirst();

    E peekLast();

    E removeFirst();

    E removeLast();

    E removeAt(int index);

    boolean remove(Object obj);

    int indexOf(Object obj);

    boolean contains(Object obj);


}
