package com.oops.generics.Comparisons;

public class Main {
    public static void main(String[] args) {
        Student utkarsh=new Student(21,89.4f);
        Student prerna=new Student(11,91.8f);

        if(utkarsh.compareTo(prerna)<0)
            System.out.println("Prerna scored higher than Utkarsh");
    }
}
