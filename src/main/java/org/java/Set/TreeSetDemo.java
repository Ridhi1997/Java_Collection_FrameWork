package org.java.Set;

import java.util.Set;
import java.util.TreeSet;
/*
  1) TreeSet -->  It contains only unique elements and maintains ascending order.
  2) TC --> O(log (n))

 */
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(6);
        set.add(4);
        set.add(15);
        set.add(1);
        set.add(6);

        System.out.println(set); // o/p--> 1,4,6,10,15

        set.remove(4); // removing 4
        System.out.println(set); // o/p--> 1,6,10,15

        System.out.println(set.contains(15)); // true

        System.out.println(set.isEmpty()); // false

        System.out.println(set.size()); // o/p-->4

    }
}
