package org.java.Map;
/*
 Map
 1)Map will store data in the form of key and value pair.
 2) if we'll try to add value for existing key then it'll override the value.
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        map.put("Two",23); // override value for existing key.
        System.out.println(map);
        map.remove("Three");


        System.out.println(map);
//        if(!map.containsKey("Two")){
//            map.put("Two",25);
//        }
        map.putIfAbsent("Two",25);  // check
//        System.out.println(map);

//        System.out.println(map.containsValue(3)); // if value exist, True
//
//        // 1. Map.entrySet() entries using for-each loop
//        for (Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " :  "+ entry.getValue());
//        }
//       // 2.  Iterating over keys or values using keySet() and values() methods
//        for (String  key : map.keySet()){
//            System.out.println(key);
//        }
//
//        for (Integer value : map.values()){
//            System.out.println(value);
//        }
//
//        //3. Iterating using iterators over Map.Entry<K, V>
//        Iterator<Map.Entry<String,Integer>> itr  = map.entrySet().iterator();
//        while (itr.hasNext()){
//             Map.Entry<String,Integer> entry = itr.next();
//            System.out.println(entry.getKey() + " : " +entry.getValue());
//
//        }
        // 4. Using forEach(action) method :
        map.forEach((k,v)-> System.out.println(k + " :" + v));




    }
}
