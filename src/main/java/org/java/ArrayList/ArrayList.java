package org.java.ArrayList;

import java.util.*;


 class ArrayListDemo {
    public static void main(String[] args) {
         List<Integer> ls = new ArrayList<>();
         ls.add(1);
         ls.add(2);
         ls.add(3);
        System.out.println(ls);
        ls.add(4); // it'll add at the end of the list
        System.out.println(ls);
        ls.add(1,50); // it'll add the value at index 1
        System.out.println(ls);

        List<Integer> newList = new ArrayList<>();   // create new list
        newList.add(100);
        newList.add(120);

        ls.addAll(newList); //this will add the all element in ls
        System.out.println(ls);

        System.out.println(ls.get(1)); // it'll fetch the value of given index // ans -> 50

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        /*iterate the list by using for loop.*/
        for (int i=0; i<list2.size();i++){
            System.out.println("the element is : "+list2.get(i));
        }

        /*iterate the list by using for each loop.*/
        for (Integer list : list2){
            System.out.println("Foreach element is :"+list);
        }

        /* iterate the list by using iterator */
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()){
            System.out.println("iterator : "+it.next());
        }


        /*System.out.println(list2);
        list2.remove(1);  // This will remove the element at index 1 i.e 20.
        System.out.println(list2);

        list2.remove(Integer.valueOf(30));  // This will remove 30 from the list
        System.out.println(list2);

        System.out.println(list2.contains(50));// it'll check the value is present or not . if it's present then it'll will return true or else false
        System.out.println(list2.contains(100000)); // false
*/






    }
}
