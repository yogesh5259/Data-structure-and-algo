package com.data.DoublyLinkedList;

public class DoublyLinkedList<E> implements List<E> {
    private int size = 0;
    private Node<E> head = null;
    private Node<E> tail = null;


    private static class Node<E> {
        E data;
        Node<E> next, prev;

        public Node(E data, Node<E> prev, Node<E> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }


    @Override
    public void clear() {
        Node<E> a = head;
        while(a != null){
            Node<E> tmp = a.next;
            a.prev = a.next =null;
            a.data = null;
            a = tmp;
        }
        head = tail = null;
        size = 0;
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
    public void add(E elem) {
        addLast(elem);
    }

    @Override
    public void addLast(E elem) {
        if (isEmpty()) {
            head = tail = new Node<E>(elem,null,null);
        } else {
            tail.next = new Node<>(elem,tail,null);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public void addFirst(E elem) {
        if (isEmpty()){
            head = tail = new Node<E>(elem,null,null);
        } else {
            head.prev = new Node<E>(elem,null,head);
            head = head.prev;
        }
        size++;
    }

    @Override
    public void addAt(int index, E elem) {
        if (index < 0) throw new IndexOutOfBoundsException();
        if (index == 0) {
            addFirst(elem);
            return;
        }
        if (index == size){
            addLast(elem);
            return;
        }
        Node<E> tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        Node<E> newNode = new Node<>(elem,tmp,tmp.next);
        tmp.next.prev = newNode;
        tmp.next = newNode;
        size++;
    }

    @Override
    public E peekFirst(){
        if (isEmpty()) throw new RuntimeException("Empty List");
        return head.data;
    }

    @Override
    public E peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty List");
        return tail.data;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) throw new RuntimeException("Empty List");
        E data = head.data;
        head = head.next;
        --size;

        if (isEmpty()) tail = null; // if empty then tail points to null
        else head.prev = null; // else point head.prev = null

        return data;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E removeAt(int index) {
        return null;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }
}
