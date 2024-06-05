package org.java.Set;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Ridhi",2));
        studentSet.add(new Student("Yogesh",5));
        studentSet.add(new Student("King",24));
        studentSet.add(new Student("Nidhi",2));
        studentSet.add(new Student("Ridh",2));

        //before adding equals and hashcode
//        System.out.println(studentSet); //[Student{name='King', rollNo=24}, Student{name='Ridh', rollNo=2}, Student{name='Nidhi', rollNo=2}, Student{name='Ridhi', rollNo=2}, Student{name='Yogesh', rollNo=5}]

        // after implemented equals() and hashCode()
        System.out.println(studentSet);// [Student{name='Ridhi', rollNo=2}, Student{name='Yogesh', rollNo=5}, Student{name='King', rollNo=24}]

        /*
         Note :
         1)without implementing equal() and hashcode() method , set will allow all the records because they will consider unique for all object.
         2) If i'll implement hashCode() & equal() , set will not allowed all the records based on particular check
         */
    }
}
