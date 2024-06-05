package org.java.ArrayList;

import java.util.ArrayList;
/*
  op--> 10
Ridhi
20
Nidhi
30
Tina
40
Zeba
50
Suman
 */

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
//        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ridhi");
        list2.add("Nidhi");
        list2.add("Tina");
        list2.add("Zeba");
        list2.add("Suman");
//        System.out.println(list2);

         for (int i=0; i<list1.size();i++){

             System.out.println(list1.get(i));
             System.out.println(list2.get(i));
         }



    }
}
