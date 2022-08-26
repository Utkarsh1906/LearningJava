package com.oops;

public class Constructor {
    public static void main(String[] args) {
        Student utkarsh=new Student();
        System.out.println(utkarsh.rno);
        final Student shivam=new Student();
        System.out.println(shivam.rno);
        Integer b=10;
        b=20;
        System.out.println(b);
    }
}
class Student{
    int rno;
    String name;
    float marks;

    public Student() {
        this.rno=5;
    }
}

