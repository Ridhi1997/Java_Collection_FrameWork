package org.java.ArrayDeque;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer>  arrayDeque = new ArrayDeque<>();

        // add operation
        arrayDeque.offer(23); // it'll add normal
        arrayDeque.offerFirst(12); //it'll  add in head
        arrayDeque.offerLast(45); // it'll add in last
        arrayDeque.offer(26);

        System.out.println(arrayDeque); //o/p-> 12,23,45,26

        //peek operation
        System.out.println(arrayDeque.peek()); // o/p-->12
        System.out.println(arrayDeque.peekFirst()); // o/p->12
        System.out.println(arrayDeque.peekLast()); // o/p--> 26

        //poll() operation
        System.out.println(arrayDeque.poll()); // 12
        System.out.println(arrayDeque); // 23,45,26

        System.out.println(arrayDeque.pollFirst()); // o/p-->23 removed
        System.out.println(arrayDeque); // o/p--> 45, 26

        System.out.println(arrayDeque.pollLast()); // o/p--> 26
        System.out.println(arrayDeque); // o/p-> 45




    }
}
