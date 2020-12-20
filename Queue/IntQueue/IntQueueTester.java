package com.data.IntQueue;

public class IntQueueTester {

    public static void main(String[] args) {
        IntQueue queue = new IntQueue(10);
        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }
        System.out.println(queue.size);
        for (int q = 0; q < 5; q++) {
            System.out.print(queue.poll()+ " ");
        }
        System.out.println();
        for (int i = 0; i <3; i++) {
            queue.offer(i);
        }
        System.out.println(queue.size);

        for (int i = 0; i < 8; i++) {
            System.out.print(queue.poll() + " ");
        }

        System.out.println();
        benchMarkTest();
    }

    private static void benchMarkTest() {

        int n = 10000000;
        IntQueue intQ = new IntQueue(n);

        // IntQueue times at around 0.0324 seconds
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) intQ.offer(i);
        for (int i = 0; i < n; i++) intQ.poll();
        long end = System.nanoTime();
        System.out.println("IntQueue Time: " + (end - start) / 1e9);

        // ArrayDeque times at around 1.438 seconds
        java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>();
        // java.util.ArrayDeque <Integer> arrayDeque = new java.util.ArrayDeque<>(n); // strangely the
        // ArrayQueue is slower when you give it an initial capacity.
        start = System.nanoTime();
        for (int i = 0; i < n; i++) arrayDeque.offer(i);
        for (int i = 0; i < n; i++) arrayDeque.poll();
        end = System.nanoTime();
        System.out.println("ArrayDeque Time: " + (end - start) / 1e9);
    }
}
