package org.java.CollectionClass;

import java.util.*;

public class LearnCollectionsClass {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Ridhi",2));
        list.add(new Student("Nidhi",4));
        list.add(new Student("Golu",3));
        list.add(new Student("Rupa",1));

        Student s1 =  new Student("Ridhi",2);
        Student s2 = new Student("Rupa",3);
        System.out.println(s1.compareTo(s2));
        System.out.println(list);

        Collections.sort(list,(obj1,obj2)->obj1.name.compareTo(obj2.name));
        System.out.println(list);


//        List<Integer> ls = new ArrayList<>();
//        ls.add(10);
//        ls.add(5);
//        ls.add(20);
//        ls.add(30);
//        ls.add(15);
//        ls.add(15);
//
////
//        System.out.println("Min element "+ Collections.min(ls)); //o/p-->5
//        System.out.println("Max element "+ Collections.max(ls)); //o/p-->30
//        System.out.println("Frequency of 15 : "+Collections.frequency(ls,15)); // o/p-->2

        /* sorting */
//        Collections.sort(ls); // sort ascending order [5,10,15,15,20,20]
//        Collections.sort(ls,Comparator.reverseOrder()); // sort in descending order  [30, 20, 15, 15, 10, 5]
//
//
//
//        System.out.println(ls);


    }
}
