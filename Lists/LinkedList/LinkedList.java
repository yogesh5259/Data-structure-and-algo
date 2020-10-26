package com.data.LinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E>, Iterable<E> {


    // Inner class for node
    // make inner class to restrict access for our self
    class Node<E> {
        E data;
        Node<E> next;

        public Node(E obj) {
            data = obj;
            next = null;
        }
    }


    class IteratorHelper implements Iterator<E> {

        Node<E> index;
        public IteratorHelper(){
            index = head;
        }
        @Override
        public boolean hasNext() {
            return (index != null);
        }

        @Override
        public E next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            E val = index.data;
            index = index.next;
            return val;
        }
    }

/*    //LinkedList properties when there is no tail pointer
    private Node<E> head;
    private int currentSize;
*/

    // LinkedList properties with tail pointer

    private Node<E> head;
    private Node<E> tail;
    private int currentSize;




/*    // LinkedList constructor

    public LinkedList() {
        head = null;
        currentSize = 0;
    }

 */


    // LinkedList constructor with tail pointer

    public LinkedList() {
        head = null;
        tail = null;
        currentSize = 0;
    }


    public int getCurrentSize(){
        return currentSize;
    }

 /*   // Add node to the beginning of LinkedList without tail pointer
    @Override
    public void addFirst(E obj) {
        Node<E> node = new Node<E>(obj);
        node.next = head;
        head = node;
        currentSize++;
    }

  */

    // AddFirst with tail pointer
    @Override
    public void addFirst(E obj) {
        Node<E> node = new Node<>(obj);

        if (head == null) {
            head = tail = node;
            currentSize++;
            return;
        }

        node.next = head;
        head = node;
        currentSize++;
    }


/*
    // AddLast without tail pointer with time complexity of O(n)
    @Override
    public void addLast(E obj) {
        Node<E> node = new Node<>(obj);
        if(head == null){
            head = node;
            currentSize++;
            return;
        }
        Node<E> tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = node;
    }
}
 */

// AddLast with tail pointer with time complexity of O(1)
    @Override
    public void addLast(E obj) {
        Node<E> node = new Node<>(obj);
        if(head == null){
            head = tail = node;
            currentSize++;
            return;
        }

        tail.next = node;
        tail = node;
        currentSize++;
    }

    // RemoveFirst from the list
    @Override
    public E removeFirst(){
        if (head == null){
            return null;
        }
        E tmp = head.data;
        if (head == tail){  // other option currentSize == 1 head.next == null
            head = tail = null;
        } else{
            head = head.next;
        }
        currentSize--;
        return tmp;
    }


    // we need to start with head there is not alternative method in single LinkedList
    @Override
    public E removeLast() {
        if(head == null) {
            return null;
        }
        if (head == tail) {
            return removeFirst();
        }

        Node<E> current = head, previous = null;
        while (current != tail){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        tail = previous;
        currentSize--;
        return current.data;
    }

    @Override
    public E remove(E obj) {
        Node<E> current = head, previous = null;
        while(current != null){
            if(((Comparable<E>)obj).compareTo(current.data)==0){
                if (current == head){
                    return removeFirst();
                }
                if (current == tail){
                    return removeLast();
                }
                currentSize--;
                previous.next = current.next;
                return current.data;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }

    @Override

    public boolean contains(E obj){
        Node<E> current = head;
        while(current != null){
            if(((Comparable<E>)obj).compareTo(current.data)== 0){
                return true;
            }
            current = current.next;
        }
        return false;
    }


    public E peekFirst(){
        if (head == null){
            return null;
        }
        return head.data;
    }

    public E peekLast(){
        if (tail == null){
            return null;
        }
        return tail.data;
    }


    @Override
    public Iterator<E> iterator() {
        return new IteratorHelper();
    }


}