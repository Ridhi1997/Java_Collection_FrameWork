package org.java.LiskedList;

import java.util.LinkedList;
import java.util.Queue;
// Queue -> first in first out eg ticket counter...etc
public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); // offer() will add the value in queue.
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue); // op-> 12,24,26
        System.out.println(queue.poll()); //The poll() method allows you to retrieve and remove the top most element (head) of a Queue. i.e 12

        System.out.println(queue); // o/p-> 24,36

        System.out.println(queue.peek()); // peek() will check whose the next in queue i.e 24

/*
  Note :
  add () -->  Add is used to insert a specified element into the queue. It returns true when the task is successful or else it throws an exception.
  offer() -->   Offer is used to insert a specified element into the queue. It returns true when the task is successful or else its return false.

 remove() --> Remove is used to return the head of the queue when the task is successful or else throws an exception if the queue is empty.
 poll() --> Remove is used to return the head of the queue when the task is successful or else it returns null if the queue is empty.

 element() --> Element is used to return the head of the queue when the task is successful or else throws an exception if the queue is empty.
 peek() --> Peek is used to return the head of the queue when the task is successful or else it returns null if the queue is empty.
 */

    }
}
