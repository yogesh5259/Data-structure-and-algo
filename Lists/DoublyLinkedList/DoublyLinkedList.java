package com.data.DoublyLinkedList;

import java.util.Iterator;

public class DoublyLinkedList<E> implements List<E>, Iterable<E> {
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
        if (isEmpty()) throw new RuntimeException("Empty List");
        E data = tail.data;
        tail = tail.prev;
        --size;

        if (isEmpty()) head = null;
        else tail.next = null;
        return data;
    }
    private E remove(Node<E> node){
        if (node.prev == null) return removeFirst();
        if (node.next == null) return removeLast();

        node.prev.next = node.next;
        node.next.prev = node.prev;

        E data = node.data;
        node.next = node.prev = null;
        node.data = null;
        --size;
        return data;
    }
    @Override
    public E removeAt(int index) {
        if (index < 0 || index > size) throw new IllegalArgumentException();

        int i;
        Node<E> trav;
        if (size / 2 > index){
            for (i = 0, trav = head; i != index; i++) {
                trav = trav.next;
            }
        } else {
            for (i = size - 1, trav = tail; i != index; i--){
                trav = trav.prev;
            }
        }
        return remove(trav);
    }

    @Override
    public boolean remove(Object obj) {
        Node<E> trav = head;
        if (obj == null) {
            for (trav = head; trav != null; trav = trav.next){
                if (trav.data == null) {
                    remove(trav);
                    return true;
                }
            }
        } else {
            for (trav = head; trav != null; trav = trav.next){
                if (obj.equals(trav.data)){
                    remove(trav);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        Node<E> trav = head;
        int index = 0;
        if (obj == null) {
            for (trav = head; trav != null; trav = trav.next, index++){
                if (trav.data == null) {
                    return index;
                }

            }
        } else {
            for (trav = head; trav != null; trav = trav.next, index++){
                if (obj.equals(trav.data)){
                    return index;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public E next() {
                E data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<E> trav = head;
        while (trav != null){
            sb.append(trav.data);
            if (trav.next != null) sb.append(", ");
            trav = trav.next;
        }
        sb.append(" ]");
        return sb.toString();
    }

}
