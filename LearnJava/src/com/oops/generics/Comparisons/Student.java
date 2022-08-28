package com.oops.generics.Comparisons;

//Comparable interface of parameter type Student has a compareTo abstract method
public class Student implements Comparable<Student> {
     int rollno;
     float marks;

    @Override
    public String toString() {
        return marks + " ";
    }

    //comparison of objects in JAVA
    @Override
    public int compareTo(Student o) {
        return (int)(this.marks-o.marks);
    }

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
}
