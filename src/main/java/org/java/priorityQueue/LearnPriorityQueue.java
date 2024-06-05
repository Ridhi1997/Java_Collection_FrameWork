package org.java.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // minimum value is priority,i.e min heap
        Queue<Integer>  pq = new PriorityQueue<>();

        // Add elements to the queue
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq); // output -> 12,36,24,40

        pq.poll(); // remove 12
        System.out.println(pq);

        System.out.println(pq.peek()); // 24

        System.out.println("------------------");

        // max value set as priority .i.e it'll work as max heap
        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.offer(40);
        pq1.offer(12);
        pq1.offer(24);
        pq1.offer(36);
        System.out.println(pq1); // o/p-> 40,36,24,12

        System.out.println(pq1.peek()); // o/p-->40
        System.out.println(pq1.poll()); // o/p-->40
        System.out.println(pq1.peek()); // o/p--> 36

    }
}
