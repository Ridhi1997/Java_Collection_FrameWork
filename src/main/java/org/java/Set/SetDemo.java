package org.java.Set;

import java.util.HashSet;
import java.util.Set;

/*
--> HashSet does n't maintain insertion order
---> It'll not allow duplicate value
// TC -> O(1) , for all the operation in hashset.
 */

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(3);
        set.add(24);
        set.add(10);
        set.add(3);

        System.out.println(set); // o/p--> 32,3,24,10

        set.remove(24) ;// it'll remove 24
        System.out.println(set); // 32,3,10

        System.out.println(set.contains(100)); // false
        System.out.println(set.contains(10)); // true

        System.out.println(set.isEmpty()); // false

        System.out.println(set.size()); // o/p--> 3

        set.clear(); // clear the set
        System.out.println(set); // o/p--> []


    }
}
