package com.data.ListQueue;

public class ListQueueTester {

    public static void main(String[] args) {
        ListQueue<Integer> queue = new ListQueue<>();

        for (int i = 0; i < 30; i++) {
            queue.offer(i);
        }
        System.out.println(queue.size());


        for (int i = 0; i < 30; i++) {
            System.out.println(queue.poll());
        }

    }
}
