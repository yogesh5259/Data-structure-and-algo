package com.data.ArrayQueue;

public class ArrayQueueTester {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>(20);
        System.out.println(queue.size());
        for (int i = 0; i < 20; i++) {
            queue.offer(i);
        }
        System.out.println(queue.size());
    }
}
