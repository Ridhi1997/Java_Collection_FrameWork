package org.java.Set;

import java.util.LinkedHashSet;
import java.util.Set;

/*
  1) LinkedHashSet is maintained insertion order.
  2) It'll not allow Duplicate.
 */

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(18);
        set.add(4);
        set.add(50);
        set.add(4);

        System.out.println(set); // o/p--> 5,18,4,50

        set.remove(18); // remove 18
        System.out.println(set); // o/p--> 5,4,50

        System.out.println(set.size()); // o/p-->3

        System.out.println(set.isEmpty()); // false

        System.out.println(set.contains(50)); // true

    }
}
