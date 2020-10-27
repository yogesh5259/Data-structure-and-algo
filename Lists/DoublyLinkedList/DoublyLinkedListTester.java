package com.data.DoublyLinkedList;

public class DoublyLinkedListTester {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();

        for (int i = 0; i < 50; i++) {
            dl.add(i);
        }

        System.out.println(dl);
        System.out.println(dl.removeLast());
        System.out.println(dl.size());
        System.out.println(dl.isEmpty());
        System.out.println(dl.indexOf(30));
    }

}
