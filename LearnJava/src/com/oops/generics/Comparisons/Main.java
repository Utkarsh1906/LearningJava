package com.oops.generics.Comparisons;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student utkarsh=new Student(21,89.4f);
        Student prerna=new Student(11,98.8f);
        Student shubham=new Student(14,91.5f);
        Student pratyush=new Student(10,93.5f);
        Student harshit=new Student(1,81.5f);

        Student[] list={utkarsh,prerna,shubham,pratyush,harshit };

        System.out.println(Arrays.toString(list));

        //This runs compareTo function to compare for sorting
         Arrays.sort(list);


        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks-o2.marks);
            }
        });


        //It can also be done like this
        //using lambda functions
        Arrays.sort(list, (o1, o2) -> (int)(o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));

        if(utkarsh.compareTo(prerna)<0)
            System.out.println("Prerna scored higher than Utkarsh");
    }
}
