package org.java.ArrayasClass;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {

        int [] number = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(number,4);  // binarySearch --> will only work in sorted array i.e O(log(n))

        System.out.println("the index of element 4 in the array is  "+ index); // o/p--> 3 (index)


        Integer [] num = {10,5,20,40,30,60};
        Arrays.sort(num); // sort() --> internally use quickSort
        for (int  i : num){
            System.out.print(i +" ");
        }
        System.out.println();
        //parallel sort

        Integer [] num2 = {20,60,10,70};
        Arrays.fill(num2,12); // fill() -->will fill the value  12 for all index in array
        for (int i : num2){
            System.out.print( i +" ");
        }

    }
}
